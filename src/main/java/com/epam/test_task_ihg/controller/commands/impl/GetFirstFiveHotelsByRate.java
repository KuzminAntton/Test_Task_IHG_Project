package com.epam.test_task_ihg.controller.commands.impl;

import com.epam.test_task_ihg.constants.Constants;
import com.epam.test_task_ihg.controller.commands.Command;
import com.epam.test_task_ihg.service.exception.ServiceException;
import com.epam.test_task_ihg.service.factory.ServiceFactory;
import com.epam.test_task_ihg.service.impl.HotelServiceImpl;

import java.io.IOException;

public class GetFirstFiveHotelsByRate implements Command {
    @Override
    public String execute(String request) throws IOException, ServiceException {
        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        HotelServiceImpl hotelServiceImpl = serviceFactory.getHotelServiceImpl();
        hotelServiceImpl.init();
        hotelServiceImpl.printFirstFiveHotelsWIthHighestRate();

        response = Constants.HOTELS_THAT_I_COULD_FOUND;

        return response;
    }


}

