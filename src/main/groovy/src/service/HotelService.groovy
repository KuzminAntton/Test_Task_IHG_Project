package src.service

import com.epam.test_task_ihg.bean.Hotel

interface HotelService {

    void printFirstFiveHotelsWIthHighestRate();

    void printHotels();

    void printApartments();

    void printHostel();

    List<Hotel> getHotelsByType(def hotelType);

    void printHotelsByPriceRange(double lowerPrice, double higherPrice);

    void printHotelsByPriceRange(double higherPrice);

}