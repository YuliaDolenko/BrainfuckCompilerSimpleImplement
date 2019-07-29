package commands;

import brainfuck.Skeleton;

import java.util.List;

public class LoopCommand implements Command {
    List<Command> commands;

    public LoopCommand(List<Command> commands) {
        this.commands = commands;
    }

    public void execute(Skeleton skeleton) {
        while (skeleton.getPointerInModel() != 0) {
            for (Command command : commands) {
                command.execute(skeleton);
            }
        }
    }
}
