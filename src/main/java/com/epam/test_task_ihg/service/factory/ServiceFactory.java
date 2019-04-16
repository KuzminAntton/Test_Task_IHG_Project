package com.epam.test_task_ihg.service.factory;

import com.epam.test_task_ihg.service.impl.HotelServiceImpl;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final HotelServiceImpl hotelServiceImpl = new HotelServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public HotelServiceImpl getHotelServiceImpl() {
        return hotelServiceImpl;
    }
}
