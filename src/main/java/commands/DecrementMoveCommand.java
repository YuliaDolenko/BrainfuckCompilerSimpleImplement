package commands;

import brainfuck.Skeleton;

public class DecrementMoveCommand implements Command {
    public void execute(Skeleton skeleton) {
        skeleton.valueLess();
    }
}
