package com.epam.test_task_ihg.service.impl;

import com.epam.test_task_ihg.bean.Hotel;
import com.epam.test_task_ihg.constants.Constants;
import com.epam.test_task_ihg.service.HotelService;
import com.epam.test_task_ihg.service.exception.ServiceException;
import com.epam.test_task_ihg.store.HotelsStore;
import com.epam.test_task_ihg.store.exception.HotelsStoreException;
import com.epam.test_task_ihg.store.factory.HotelsStoreFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelServiceImpl implements HotelService {
    private List<Hotel> list;

    public void init() throws ServiceException {
        HotelsStore hotelsStore = HotelsStoreFactory.getInstance().getHotelsStore();
        list = new ArrayList<>();
        try {
            hotelsStore.init();
        } catch (HotelsStoreException e) {
            throw new ServiceException();
        }
        list = hotelsStore.getHotelsList();
    }

    public  void printFirstFiveHotelsWIthHighestRate() {
        List<Hotel> bufferList = new ArrayList<Hotel>();
        for(Hotel hotel : list) {
            if(hotel.getBreakfast().equals(Constants.BREAKFAST_INCLUDED)) {
                bufferList.add(hotel);
            }
        }
        Collections.sort(bufferList, Hotel.HotelRateComparator);


        for(int i = 0; i < 5 && i < bufferList.size(); i++) {
            System.out.println(bufferList.get(i));
        }
    }

    public void printHotels() {
        System.out.println(Constants.HOTEL + " :");
        for (Hotel hotel : getHotelsByType(Constants.HOTEL)){
            System.out.println(hotel);
        }
    }

    public void printApartments() {
        System.out.println(Constants.APARTMENT + " :");
        for (Hotel hotel : getHotelsByType(Constants.APARTMENT)){
            System.out.println(hotel);
        }
    }

    public void printHostel() {
        System.out.println(Constants.HOSTEL + " :");
        for (Hotel hotel : getHotelsByType(Constants.HOSTEL)){
            System.out.println(hotel);
        }
    }

    public List<Hotel> getHotelsByType(String hotelType) {
        List<Hotel> bufferList = new ArrayList<Hotel>();
        for(Hotel hotel : list) {
            if(hotel.getType().equals(hotelType)) {
                bufferList.add(hotel);
            }
        }
        Collections.sort(bufferList, Hotel.HotelPriceComparator);

        return bufferList;

    }



    public void printHotelsByPriceRange(double lowerPrice, double higherPrice) {
        List<Hotel> bufferList = new ArrayList<Hotel>();
        for(Hotel hotel : list) {
            if(hotel.getPrice() >= lowerPrice && hotel.getPrice() <= higherPrice) {
                bufferList.add(hotel);
            }
        }
        Collections.sort(bufferList, Hotel.HotelNameComparator);

        System.out.println(lowerPrice + "-" + higherPrice + " $");
        for(Hotel hotel : bufferList) {
            System.out.println(hotel);
        }

    }

    public void printHotelsByPriceRange(double higherPrice) {
        List<Hotel> bufferList = new ArrayList<Hotel>();
        for(Hotel hotel : list) {
            if(hotel.getPrice()>= higherPrice ) {
                bufferList.add(hotel);
            }
        }
        Collections.sort(bufferList, Hotel.HotelNameComparator);

        System.out.println(higherPrice + "+" + " $");
        for(Hotel hotel : bufferList) {
            System.out.println(hotel);
        }

    }
}
