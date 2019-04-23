package src.util

import src.controller.commands.CommandName

class Help {
    private static String wrongInput = "Please use only supported commands : \n" +
            CommandName.GET_FIRST_FIVE_HOTELS_BY_RATE + "\n" +
            CommandName.GET_HOTELS_BY_GROUP + "\n" +
            CommandName.GET_HOTELS_BY_PRICE_RANGE + "\n" +
            CommandName.EXIT + "\n" +
            """Search Hotels request must look like :  
get_first_five_hotels_by_rate- 
get_hotels_by_group-
get_hotels_by_price_range- 
exit- : if you want to close program
(don't forget about '-' after command) """


    public static String getWrongInput() {
        return wrongInput;
    }
}
