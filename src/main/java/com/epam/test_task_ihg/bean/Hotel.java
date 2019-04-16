package com.epam.test_task_ihg.bean;

import java.io.Serializable;
import java.util.Comparator;

public class Hotel implements Serializable {
    private String name = null;
    private String type = null;
    private String price = null;
    private String rate = null;
    private boolean breakfast = false;

    public Hotel() {

    }

    public Hotel(String name, String type, String price, String rate, boolean breakfast) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rate = rate;
        this.breakfast = breakfast;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;


        if(name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if(price != null ? !price.equals(hotel.price) : hotel.price != null) return false;
        if(type != null ? !type.equals(hotel.type) : hotel.type != null) return false;
        if(rate != null ? !rate.equals(hotel.rate) : hotel.rate != null) return false;
        return breakfast && hotel.breakfast;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return
                "       " + name  +
                ", " + type +
                ", " + price  +
                ", " + rate  +
                ", " + breakfast;
    }

    public static Comparator<Hotel> HotelNameComparator
            = new Comparator<Hotel>() {

        public int compare(Hotel hotel1, Hotel hotel2) {

            String hotelName1 = hotel1.getName().toUpperCase();
            String hotelName2 = hotel2.getName().toUpperCase();

            //ascending order
            return hotelName1.compareTo(hotelName2);

        }

        };

    public static Comparator<Hotel> HotelRateComparator
            = new Comparator<Hotel>() {

        public int compare(Hotel hotel1, Hotel hotel2) {

            String hotelRate1 = hotel1.getRate().toUpperCase();
            String hotelRate2 = hotel2.getRate().toUpperCase();

            //ascending order
            return hotelRate2.compareTo(hotelRate1);

        }

    };

    public static Comparator<Hotel> HotelPriceComparator
            = new Comparator<Hotel>() {

        public int compare(Hotel hotel1, Hotel hotel2) {

            String hotelprice1 = hotel1.getPrice().toUpperCase();
            String hotelprice2 = hotel2.getPrice().toUpperCase();

            //ascending order
            return hotelprice1.compareTo(hotelprice2);

        }

    };


    }

