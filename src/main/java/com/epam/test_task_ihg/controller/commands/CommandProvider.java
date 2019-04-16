package com.epam.test_task_ihg.controller.commands;

import com.epam.test_task_ihg.controller.commands.impl.Exit;
import com.epam.test_task_ihg.controller.commands.impl.GetFirstFiveHotelsByRate;
import com.epam.test_task_ihg.controller.commands.impl.GetHotelsByGroup;
import com.epam.test_task_ihg.controller.commands.impl.GetHotelsByPrice;
import org.apache.log4j.Logger;
import com.epam.test_task_ihg.util.Help;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private static final Logger log = Logger.getLogger(CommandProvider.class);

    private final Map<CommandName, Command> repository = new HashMap<>();

    public CommandProvider() {


        repository.put(CommandName.GET_FIRST_FIVE_HOTELS_BY_RATE, new GetFirstFiveHotelsByRate());
        repository.put(CommandName.GET_HOTELS_BY_GROUP, new GetHotelsByGroup());
        repository.put(CommandName.GET_HOTELS_BY_PRICE_RANGE, new GetHotelsByPrice());

        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
        repository.put(CommandName.WRONG_COMMAND, new WrongCommand());

        repository.put(CommandName.EXIT, new Exit());

    }

    public Command getCommand(String name) {

        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);

        } catch (IllegalArgumentException | NullPointerException e) {
            log.error(e);
            System.out.println(Help.getWrongInput());
            command = repository.get(CommandName.WRONG_REQUEST);

        }
        return command;
    }
}
