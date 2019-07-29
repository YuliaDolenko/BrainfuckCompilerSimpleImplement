package commands;

import brainfuck.Skeleton;

public class EmptyCommand  implements Command{
    public void execute(Skeleton skeleton) {
        System.out.println("No preset values!");
    }
}
