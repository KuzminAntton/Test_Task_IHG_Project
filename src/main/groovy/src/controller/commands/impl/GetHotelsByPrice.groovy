package src.controller.commands.impl

import src.constants.Constants
import src.controller.commands.Command
import src.service.exception.ServiceException
import src.service.factory.ServiceFactory
import src.service.impl.HotelServiceImpl

class GetHotelsByPrice implements Command {
    @Override
    String execute(String request) throws IOException, ServiceException {
        String response = null

        ServiceFactory serviceFactory = ServiceFactory.getInstance()
        HotelServiceImpl hotelServiceImpl = serviceFactory.getHotelServiceImpl()
        hotelServiceImpl.init()
        hotelServiceImpl.printHotelsByPriceRange(0, 39.99)
        hotelServiceImpl.printHotelsByPriceRange(40, 79.99)
        hotelServiceImpl.printHotelsByPriceRange( 80)

        response = Constants.HOTELS_THAT_I_COULD_FOUND_IN_THREE_PRICE_RANGES

         response
    }
}
