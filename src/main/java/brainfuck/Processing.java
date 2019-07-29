package brainfuck;

import commands.*;

import java.util.ArrayList;
import java.util.List;

public class Processing {
    public Command simpleValues(Character charValue) {
        if (charValue == '+') {
            return new PlusCommand();
        } else if (charValue == '-') {
            return new MinusCommand();
        } else if (charValue == '.') {
            return new OutputCommand();
        } else if (charValue == '>') {
            return new IncrementMoveCommand();
        } else if (charValue == '<') {
            return new DecrementMoveCommand();
        }
        return new EmptyCommand();
    }

    public List<Command> processingValues(String code) {
        int nestingLevel = 0;
        int initialIndexLoop = 0;
        List<Command> listOfValues = new ArrayList<Command>();
        String loop;
        char[] charValueOfCode = code.toCharArray();

        for (int i = 0; i < code.length(); i++) {
            if (charValueOfCode[i] == '[') {
                if (nestingLevel == 0) {
                    initialIndexLoop = i;
                }
                nestingLevel++;
            } else if (charValueOfCode[i] == ']') {
                nestingLevel--;
                if (nestingLevel == 0) {
                    loop = code.substring(initialIndexLoop + 1, i);
                    listOfValues.add(new LoopCommand(processingValues(loop)));
                }
            } else if (nestingLevel == 0) {
                listOfValues.add(simpleValues(charValueOfCode[i]));
            }
        }
        return listOfValues;
    }
}
