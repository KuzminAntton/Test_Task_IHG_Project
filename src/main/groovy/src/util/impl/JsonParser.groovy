package src.util.impl

import groovy.json.JsonSlurper
import src.bean.Hotel
import src.util.Parser

class JsonParser implements Parser {
    @Override
    def parseJsonToHotelsList(String fileCntent) {
        def list = new JsonSlurper().parseText(fileCntent)
        List<Hotel> hotelsList = new ArrayList<>()

        list.each {
            hotelsList.add(new Hotel(
                    it.name,
                    it.type,
                    it.price,
                    it.rating,
                    it.breakfast))
        }
        hotelsList
    }
}
