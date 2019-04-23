package src.controller.commands.impl

import com.epam.test_task_ihg.controller.commands.impl.GetHotelsByGroup
import org.apache.log4j.Logger
import src.constants.Constants
import src.controller.commands.Command
import src.service.exception.ServiceException
import src.service.factory.ServiceFactory
import src.service.impl.HotelServiceImpl

class GetHotelsByType implements Command {
    private static final Logger log = Logger.getLogger(GetHotelsByGroup.class)
    @Override
    String execute(String request) {

        String response = null

        ServiceFactory serviceFactory = ServiceFactory.getInstance()
        HotelServiceImpl hotelServiceImpl = serviceFactory.getHotelServiceImpl()
        try {
            hotelServiceImpl.init()
        } catch (ServiceException e) {
            log.error(e.getMessage())
        }
        hotelServiceImpl.printHotels()
        hotelServiceImpl.printHostel()
        hotelServiceImpl.printApartments()

        response = Constants.ALL_GROUPS_THAT_I_COULD_FOUND

         response
    }
}
