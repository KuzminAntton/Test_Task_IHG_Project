package com.epam.test_task_ihg.util;

import com.epam.test_task_ihg.controller.commands.CommandName;

public class Help {
    private static String wrongInput = "Please use only supported commands : \n" +
            CommandName.GET_FIRST_FIVE_HOTELS_BY_RATE + "\n" +
            CommandName.GET_HOTELS_BY_GROUP + "\n" +
            CommandName.GET_HOTELS_BY_PRICE_RANGE + "\n" +
            CommandName.EXIT + "\n" +
            "Search Hotels request must look like : " + "\n" +
            "get_first_five_hotels_by_rate-" + "\n" +
            "get_hotels_by_group-" + "\n" +
            "get_hotels_by_price_range-" + "\n" +
            "exit- : if you want to close program" + "\n" +
            "(don't forget about '-' after command)";


    public static String getWrongInput() {
        return wrongInput;
    }
}
