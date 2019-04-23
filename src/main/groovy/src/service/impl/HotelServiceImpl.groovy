package src.service.impl


import src.bean.Hotel
import src.constants.Constants
import src.service.HotelService
import src.service.exception.ServiceException
import src.store.exception.StoreException
import src.store.factory.HotelStoreFactory
import src.store.impl.HotelStoreImpl

class HotelServiceImpl implements HotelService {
    private List<Hotel> list

    void init() {
        HotelStoreImpl hotelsStore = HotelStoreFactory.getInstance().getHotelStore()
        list = new ArrayList<>()
        try {
            hotelsStore.init()
        } catch (StoreException e) {
            throw new ServiceException()
        }
        list = hotelsStore.getHotelsList()
    }

    @Override
    void printFirstFiveHotelsWIthHighestRate() {
        List<Hotel> bufferList = new ArrayList<Hotel>()

        list.each {
            if(it.getBreakfast() == (Constants.BREAKFAST_INCLUDED) ) {
                bufferList.add(it)
            }
        }

        bufferList = bufferList.toSorted() {
            a, b -> b.rating <=> a.rating
        }

       for(def i = 0; i < bufferList.size() && i < 5; i++) {
           println bufferList.get(i)
       }

    }

    @Override
    void printHotels() {
        println Constants.HOTEL + " :"
        for (Hotel hotel : getHotelsByType(Constants.HOTEL)){
            println hotel
        }
    }

    @Override
    void printApartments() {
        println Constants.APARTMENT + " :"
        for (Hotel hotel : getHotelsByType(Constants.APARTMENT)){
            println hotel
        }
    }

    @Override
    void printHostel() {
        println Constants.HOSTEL + " :"
        for (Hotel hotel : getHotelsByType(Constants.HOSTEL)){
            println hotel
        }
    }

    @Override
    List<Hotel> getHotelsByType(Object hotelType) {
        List<Hotel> bufferList = new ArrayList<Hotel>()
        for(Hotel hotel : list) {
            if(hotel.getType() == hotelType) {
                bufferList.add(hotel)
            }
        }


        bufferList = bufferList.toSorted() {
            a, b -> a.price <=> b.price
        }

        return bufferList

    }

    @Override
    void printHotelsByPriceRange(double lowerPrice, double higherPrice) {
        List<Hotel> bufferList = new ArrayList<Hotel>()
        for(Hotel hotel : list) {
            if(hotel.getPrice() >= lowerPrice && hotel.getPrice() <= higherPrice) {
                bufferList.add(hotel)
            }
        }

        bufferList = bufferList.toSorted() {
            a, b -> a.name <=> b.name
        }
        println lowerPrice + "-" + higherPrice + " \$"
        for(Hotel hotel : bufferList) {
            println hotel
        }
    }

    @Override
    void printHotelsByPriceRange(double higherPrice) {
        List<Hotel> bufferList = new ArrayList<Hotel>()
        for(Hotel hotel : list) {
            if(hotel.getPrice()>= higherPrice ) {
                bufferList.add(hotel)
            }
        }

        bufferList = bufferList.toSorted() {
            a, b -> a.name <=> b.name
        }

        println higherPrice + "+" + " \$"
        for(Hotel hotel : bufferList) {
            println hotel
        }
    }
}
