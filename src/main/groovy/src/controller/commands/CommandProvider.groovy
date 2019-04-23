package src.controller.commands

import com.epam.test_task_ihg.util.Help
import org.apache.log4j.Logger
import src.controller.commands.impl.Exit
import src.controller.commands.impl.GetFirstFivwHotelsByRating
import src.controller.commands.impl.GetHotelsByPrice
import src.controller.commands.impl.GetHotelsByType

class CommandProvider {
    private static final Logger log = Logger.getLogger(CommandProvider.class)

    private final Map<CommandName, Command> repository = new HashMap<>()

     CommandProvider() {


        repository.put(CommandName.GET_FIRST_FIVE_HOTELS_BY_RATE, new GetFirstFivwHotelsByRating())
        repository.put(CommandName.GET_HOTELS_BY_GROUP, new GetHotelsByType())
        repository.put(CommandName.GET_HOTELS_BY_PRICE_RANGE, new GetHotelsByPrice())

        repository.put(CommandName.WRONG_REQUEST, new WrongRequest())
        repository.put(CommandName.WRONG_COMMAND, new WrongCommand())

        repository.put(CommandName.EXIT, new Exit())

    }

     Command getCommand(String name) {

        CommandName commandName = null
        Command command = null

        try {
            commandName = CommandName.valueOf(name.toUpperCase())
            command = repository.get(commandName)

        } catch (IllegalArgumentException | NullPointerException e) {
            log.error(e)
            println Help.getWrongInput()
            command = repository.get(CommandName.WRONG_REQUEST)

        }
         command
    }
}
