package src.controller.commands

import com.epam.test_task_ihg.service.exception.ServiceException

interface Command {
    String execute(String request) throws IOException, ServiceException;
}