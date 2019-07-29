package commands;

import brainfuck.Skeleton;

public class OutputCommand implements Command {
    public void execute(Skeleton skeleton) {
        skeleton.outputValue();
    }
}
