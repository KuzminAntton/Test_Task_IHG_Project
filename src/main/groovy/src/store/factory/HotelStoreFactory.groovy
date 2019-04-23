package src.store.factory


import src.store.impl.HotelStoreImpl

class HotelStoreFactory {
    private static final HotelStoreFactory instance = new HotelStoreFactory()

    private final HotelStoreImpl hotelServiceImpl = new HotelStoreImpl()

    private HotelStoreFactory() {
    }

    static HotelStoreFactory getInstance() {
        instance
    }

    HotelStoreImpl getHotelStore() {
        hotelServiceImpl
    }
}
