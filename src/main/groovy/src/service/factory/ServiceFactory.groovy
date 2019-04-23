package src.service.factory

import src.service.impl.HotelServiceImpl

class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory()

    private final HotelServiceImpl hotelServiceImpl = new HotelServiceImpl()

    private ServiceFactory() {
    }

    static ServiceFactory getInstance() {
         instance
    }

    HotelServiceImpl getHotelServiceImpl() {
         hotelServiceImpl
    }
}
