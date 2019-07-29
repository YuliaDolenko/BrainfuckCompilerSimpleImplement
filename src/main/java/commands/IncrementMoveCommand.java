package commands;

import brainfuck.Skeleton;

public class IncrementMoveCommand implements Command {
    public void execute(Skeleton skeleton) {
        skeleton.valueMore();
    }
}
