package com.epam.test_task_ihg.util;

import com.epam.test_task_ihg.bean.Hotel;
import com.epam.test_task_ihg.constants.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class HotelsParserJson {
    public static List<Hotel> parse(String pathToJson) {
        Gson g = new Gson();
        List<Hotel> hotelList;

        String jsonString = readFileViaBufferedReader(pathToJson);

        hotelList = g.fromJson(jsonString, new TypeToken<List<Hotel>>(){}.getType());

        return hotelList;
    }

    private static String readFileViaBufferedReader(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
