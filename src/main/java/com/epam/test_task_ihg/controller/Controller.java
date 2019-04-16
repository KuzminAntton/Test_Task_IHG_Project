package com.epam.test_task_ihg.controller;

import com.epam.test_task_ihg.constants.Constants;
import com.epam.test_task_ihg.controller.commands.Command;
import com.epam.test_task_ihg.controller.commands.CommandProvider;
import org.apache.log4j.Logger;
import com.epam.test_task_ihg.service.exception.ServiceException;
import com.epam.test_task_ihg.util.Help;

import java.io.IOException;

public class Controller {
    private static final Logger log = Logger.getLogger(Controller.class);

    private final CommandProvider provider = new CommandProvider();

    private static final Controller instance = new Controller();

    private Controller() {
    }

    public static Controller getInstance() {
        return instance;
    }



    public void executeTask(String request) {
        try {

            String commandName;
            Command executionCommand;
            commandName = request.substring(0, request.indexOf(Constants.PARAM_DELIMETER));
            executionCommand = provider.getCommand(commandName);

            String response;
            request = request.replace(commandName, "");

            response = executionCommand.execute(request);

            System.out.println(response);

        } catch (ServiceException e1) {
            log.error(e1);
        } catch (IOException | StringIndexOutOfBoundsException e2) {
            log.error(e2);
            log.info(Help.getWrongInput());
        }


    }
}
