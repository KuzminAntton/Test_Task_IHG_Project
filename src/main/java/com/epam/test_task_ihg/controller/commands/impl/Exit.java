package com.epam.test_task_ihg.controller.commands.impl;

import com.epam.test_task_ihg.constants.Constants;
import com.epam.test_task_ihg.controller.commands.Command;

public class Exit implements Command {

    @Override
    public String execute(String request) {
        return Constants.BEST_REGARDS_AND_HAVE_I_NICE_DAY;
    }
}
