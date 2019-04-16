package com.epam.test_task_ihg.controller.commands;

import com.epam.test_task_ihg.service.exception.ServiceException;

import java.io.IOException;

public interface Command {
    String execute(String request) throws IOException, ServiceException;
}
