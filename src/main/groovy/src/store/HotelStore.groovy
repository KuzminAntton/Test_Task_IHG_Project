package src.store

import src.bean.Hotel

interface HotelStore {
        void init()
        List<Hotel> getHotelsList()
}