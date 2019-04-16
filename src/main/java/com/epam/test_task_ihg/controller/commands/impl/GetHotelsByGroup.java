package com.epam.test_task_ihg.controller.commands.impl;

import com.epam.test_task_ihg.controller.commands.Command;
import com.epam.test_task_ihg.service.exception.ServiceException;
import com.epam.test_task_ihg.service.factory.ServiceFactory;
import com.epam.test_task_ihg.service.impl.HotelServiceImpl;
import com.epam.test_task_ihg.constants.Constants;
import org.apache.log4j.Logger;

public class GetHotelsByGroup implements Command {
    private static final Logger log = Logger.getLogger(GetHotelsByGroup.class);
    @Override
    public String execute(String request) {

        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        HotelServiceImpl hotelServiceImpl = serviceFactory.getHotelServiceImpl();
        try {
            hotelServiceImpl.init();
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }
        hotelServiceImpl.printHotels();
        hotelServiceImpl.printHostel();
        hotelServiceImpl.printApartments();

        response = Constants.ALL_GROUPS_THAT_I_COULD_FOUND;

        return response;
    }
}
