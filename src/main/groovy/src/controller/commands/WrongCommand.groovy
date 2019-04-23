package src.controller.commands

import com.epam.test_task_ihg.service.exception.ServiceException
import src.constants.Constants

class WrongCommand implements Command{
    @Override
    String execute(String request) throws IOException, ServiceException {
        Constants.COMMAND_IS_NOT_CORRECT
    }
}
