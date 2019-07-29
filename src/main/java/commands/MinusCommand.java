package commands;

import brainfuck.Skeleton;

public class MinusCommand implements Command {

    public void execute(Skeleton skeleton) {
        skeleton.decrement();
    }
}
