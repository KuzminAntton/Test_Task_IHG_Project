package com.epam.test_task_ihg.start;

import com.epam.test_task_ihg.controller.exception.ControllerException;
import com.epam.test_task_ihg.view.ConsoleCommunication;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ControllerException {
        ConsoleCommunication consoleCommunication = new ConsoleCommunication();

        consoleCommunication.consoleCommunication();
    }

}
