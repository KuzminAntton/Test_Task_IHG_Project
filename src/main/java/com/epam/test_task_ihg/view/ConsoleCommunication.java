package com.epam.test_task_ihg.view;

import com.epam.test_task_ihg.constants.Constants;
import com.epam.test_task_ihg.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleCommunication {
    public void consoleCommunication() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Controller controller;
        String request = "";

        while (!request.toLowerCase().equals(Constants.EXIT_MESSAGE)) {

            request = reader.readLine();

            controller = Controller.getInstance();
            controller.executeTask(request);

        }

    }
}
