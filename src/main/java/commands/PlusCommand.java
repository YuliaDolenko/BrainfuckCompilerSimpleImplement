package commands;

import brainfuck.Skeleton;

public class PlusCommand implements Command {
    public void execute(Skeleton skeleton) {
        skeleton.increment();
    }
}
