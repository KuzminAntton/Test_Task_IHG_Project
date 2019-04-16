package com.epam.test_task_ihg.util;

import com.epam.test_task_ihg.bean.Hotel;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelParserTxt {

    public static List<Hotel> parse(File file) throws IOException {

        List<Hotel> hotelsList = new ArrayList<Hotel>();
        boolean breakfast;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine;
        String [] splittedLine;
        while((currentLine = reader.readLine()) != null) {
            splittedLine = currentLine.split(",");
            for(int i = 0; i < splittedLine.length; i++) {
                splittedLine[i] = splittedLine[i].trim();
            }
            if(splittedLine.length == 5) {
                breakfast = splittedLine[4].trim().equals("breakfast_included");

                hotelsList.add(new Hotel(
                        splittedLine[0],
                        splittedLine[1],
                        splittedLine[2],
                        splittedLine[3],
                        breakfast
                ));

            }

        }


        return hotelsList;
    }
}
