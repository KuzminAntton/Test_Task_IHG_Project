package com.epam.test_task_ihg.bean;

import java.io.Serializable;
import java.util.Comparator;

public class Hotel implements Serializable {
    private String name = null;
    private String type = null;
    private double price;
    private String rating = null;
    private String breakfast = null;

    public Hotel() {

    }

    public Hotel(String name, String type, double price, String rate, String breakfast) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rate;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;


        if(name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if(price != 0 ? !(price == hotel.price) : hotel.price != 0) return false;
        if(type != null ? !type.equals(hotel.type) : hotel.type != null) return false;
        if(rating != null ? !rating.equals(hotel.rating) : hotel.rating != null) return false;
        return breakfast != null ? breakfast.equals(hotel.breakfast) : hotel.breakfast != null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (int) price;
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return
                "       " + name  +
                ", " + type +
                ", " + price  + " $" +
                ", " + rating +
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

            String hotelRate1 = hotel1.getRating().toUpperCase();
            String hotelRate2 = hotel2.getRating().toUpperCase();

            //ascending order
            return hotelRate2.compareTo(hotelRate1);

        }

    };

    public static Comparator<Hotel> HotelPriceComparator
            = new Comparator<Hotel>() {

        public int compare(Hotel hotel1, Hotel hotel2) {

            double hotelprice1 = hotel1.getPrice();
            double hotelprice2 = hotel2.getPrice();

            //ascending order
            return Double.compare(hotelprice1, hotelprice2);

        }

    };


    }

