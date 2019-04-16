package com.epam.test_task_ihg.util;

import com.epam.test_task_ihg.bean.Hotel;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelParserTxt {

    public static List<Hotel> parse(File file) throws IOException {

        List<Hotel> hotelsList = new ArrayList<Hotel>();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine;
        String [] splittedLine;
        while((currentLine = reader.readLine()) != null) {
            splittedLine = currentLine.split(",");
            for(int i = 0; i < splittedLine.length; i++) {
                splittedLine[i] = splittedLine[i].trim();
            }
            if(splittedLine.length == 5) {


                hotelsList.add(new Hotel(
                        splittedLine[0],
                        splittedLine[1],
                        Double.parseDouble(splittedLine[2].replace("$", "")),
                        splittedLine[3],
                        splittedLine[4]
                ));

            }

        }


        return hotelsList;
    }
}
