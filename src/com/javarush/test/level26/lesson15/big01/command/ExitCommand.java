package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

class ExitCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("exit.question.y.n");

        if (ConsoleHelper.readString().equalsIgnoreCase("y"))
            ConsoleHelper.writeMessage("bye");
    }
}
