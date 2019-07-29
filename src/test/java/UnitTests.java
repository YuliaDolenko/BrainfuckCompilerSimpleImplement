import brainfuck.Processing;
import brainfuck.Skeleton;
import commands.Command;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UnitTests {
    Skeleton skeleton = new Skeleton();

    @Test
    public void testMemorySkeleton() {
        Assert.assertNotNull(skeleton.getMemorySkeleton());
    }

    @Test
    public void pointerIncrement() {
        int pointer = 5;
        pointer++;

        Assert.assertEquals(6, pointer);
    }

    @Test
    public void pointerDecrement() {
        int pointer = 5;
        pointer--;

        Assert.assertEquals(4, pointer);
    }

    @Test
    public void moveIncrement() {
        byte[] memory = new byte[1000];
        int pointer = 5;
        memory[pointer] = 5;
        memory[pointer]++;

        Assert.assertEquals(6, memory[pointer]);
    }

    @Test
    public void moveDecrement() {
        byte[] memory = new byte[1000];
        int pointer = 5;
        memory[pointer] = 5;
        memory[pointer]--;

        Assert.assertEquals(4, memory[pointer]);
    }

    @Test
    public void pointerOperations() {
        skeleton.increment();
        skeleton.decrement();
        skeleton.valueMore();
        skeleton.valueLess();

        Assert.assertEquals(skeleton.getPointer(), skeleton.getPointerInModel());
    }
}
