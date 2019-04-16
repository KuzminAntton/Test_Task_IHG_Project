package com.epam.test_task_ihg.service;

import com.epam.test_task_ihg.bean.Hotel;

import java.util.List;

public interface HotelService {

    void printFirstFiveHotelsWIthHighestRate();

    void printHotels();

    void printApartments();

    void printHostel();

    List<Hotel> getHotelsByType(String hotelType);

    void printHotelsByPriceRange(double lowerPrice, double higherPrice);

    void printHotelsByPriceRange(double higherPrice);

}
