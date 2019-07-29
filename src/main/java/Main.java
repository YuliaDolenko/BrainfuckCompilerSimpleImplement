import brainfuck.Processing;
import brainfuck.Skeleton;
import commands.Command;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        Skeleton skeleton = new Skeleton();
        Processing processing = new Processing();
        List<Command> commands = processing.processingValues(helloWorld);

        for (Command command: commands) {
            command.execute(skeleton);
        }
    }
}
