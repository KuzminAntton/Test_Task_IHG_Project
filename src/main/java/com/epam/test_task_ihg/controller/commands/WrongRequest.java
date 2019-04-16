package com.epam.test_task_ihg.controller.commands;

import com.epam.test_task_ihg.constants.Constants;

public class WrongRequest implements Command {
    @Override
    public String execute(String request) {
        return Constants.REQUEST_IS_NOT_CORRECT;
    }
}
