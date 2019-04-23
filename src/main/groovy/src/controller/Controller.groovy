package src.controller


import org.apache.log4j.Logger
import src.constants.Constants
import src.controller.commands.Command
import src.controller.commands.CommandProvider
import src.service.exception.ServiceException
import src.util.Help

class Controller {
    private static final Logger log = Logger.getLogger(Controller.class)

    private final CommandProvider provider = new CommandProvider()

    private static final Controller instance = new Controller()

    private Controller() {
    }

    static Controller getInstance() {
        return instance
    }


    void executeTask(String request) {
        try {

            String commandName
            Command executionCommand
            commandName = request.substring(0, request.indexOf(Constants.PARAM_DELIMETER))
            executionCommand = provider.getCommand(commandName)

            String response
            request = request.replace(commandName, "")

            response = executionCommand.execute(request)

            println response

        } catch (ServiceException e1) {
            log.error(e1)
        } catch (IOException | StringIndexOutOfBoundsException e2) {
            log.error(e2)
            log.info(Help.getWrongInput())
        }


    }
}
