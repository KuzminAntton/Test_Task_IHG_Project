package src.bean

class Hotel implements Serializable{
     def name = null
     def type = null
     def price
     def rating = null
     def breakfast = null

     Hotel() {

    }

    Hotel(name, type, price, rating, breakfast) {
        this.name = name
        this.type = type
        this.price = price
        this.rating = rating
        this.breakfast = breakfast
    }

    @Override
     boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.epam.test_task_ihg.bean.Hotel hotel = (com.epam.test_task_ihg.bean.Hotel) o;


        if(name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if(price != 0 ? !(price == hotel.price) : hotel.price != 0) return false;
        if(type != null ? !type.equals(hotel.type) : hotel.type != null) return false;
        if(rating != null ? !rating.equals(hotel.rating) : hotel.rating != null) return false;
        return breakfast != null ? breakfast.equals(hotel.breakfast) : hotel.breakfast != null;

    }

    @Override
     int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (int) price;
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }


    @Override
     String toString() {

                name + " " +
                type + " " +
                price + " \$ " +
                rating + " " +
                breakfast + " groovy"
    }
}
