package src.view.impl

import src.constants.Constants
import src.controller.Controller
import src.view.ConsoleCommunication

class ConsoleCommunicationImpl implements ConsoleCommunication {
    @Override
    void consoleCommunication() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        Controller controller
        String request = ""

        while (!request.toLowerCase().equals(Constants.EXIT_MESSAGE)) {

            request = reader.readLine()

            controller = Controller.getInstance()
            controller.executeTask(request)

        }
    }
}
