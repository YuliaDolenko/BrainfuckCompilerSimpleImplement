package brainfuck;

public class Skeleton {
    private byte[] memory = new byte[30000];
    private int pointer;

    private static Skeleton memoryModel;

    public Skeleton() {
    }

    public Skeleton getMemorySkeleton() {
        if (memoryModel == null) {
            memoryModel = new Skeleton();
        }
        return memoryModel;
    }

    public byte getPointerInModel() {
        return memory[pointer];
    }

    public int getPointer(){
        return pointer;
    }

    public void increment() {
        memory[pointer]++;
    }

    public void decrement() {
        memory[pointer]--;
    }

    public void valueMore() {
        if (pointer == memory.length - 1) {
            pointer = 0;
        } else {
            pointer++;
        }
    }

    public void valueLess() {
        if (pointer == 0) {
            pointer = memory.length - 1;
        } else {
            pointer--;
        }
    }

    public void outputValue() {
        System.out.print((char) memory[pointer]);
    }
}
