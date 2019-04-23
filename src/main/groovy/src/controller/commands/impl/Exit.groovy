package src.controller.commands.impl

import src.constants.Constants
import src.controller.commands.Command

class Exit implements Command {
    @Override
    String execute(String request) {
         Constants.BEST_REGARDS_AND_HAVE_I_NICE_DAY
    }
}
