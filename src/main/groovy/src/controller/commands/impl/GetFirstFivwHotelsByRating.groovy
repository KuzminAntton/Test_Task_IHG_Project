package src.controller.commands.impl

import src.constants.Constants
import src.controller.commands.Command
import src.service.exception.ServiceException
import src.service.factory.ServiceFactory
import src.service.impl.HotelServiceImpl


class GetFirstFivwHotelsByRating implements Command {
    @Override
    String execute(String request) throws IOException, ServiceException {
        String response = null

        ServiceFactory serviceFactory = ServiceFactory.getInstance()
        HotelServiceImpl hotelServiceImpl = serviceFactory.getHotelServiceImpl()
        hotelServiceImpl.init()
        hotelServiceImpl.printFirstFiveHotelsWIthHighestRate()

        response = Constants.HOTELS_THAT_I_COULD_FOUND

         response
    }
}
