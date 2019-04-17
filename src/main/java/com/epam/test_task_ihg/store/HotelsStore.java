package com.epam.test_task_ihg.store;

import com.epam.test_task_ihg.bean.Hotel;
import com.epam.test_task_ihg.constants.Constants;
import com.epam.test_task_ihg.store.exception.HotelsStoreException;
import com.epam.test_task_ihg.util.HotelParserTxt;
import com.epam.test_task_ihg.util.HotelsParserJson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class HotelsStore {
    private List<Hotel> hotelsList;

    public void init() throws HotelsStoreException {
        try {
             InputStream input = new FileInputStream(Constants.PROPERTY_PATH);

                Properties prop = new Properties();


                prop.load(input);


            hotelsList = HotelsParserJson.parse(prop.getProperty(Constants.PROPERTY_NAME_PATH_JSON));
        } catch (IOException e) {
            throw new HotelsStoreException();
        }
    }

    public List<Hotel> getHotelsList() {
        return hotelsList;
    }
}
