package src.store.impl

import com.epam.test_task_ihg.constants.Constants
import com.epam.test_task_ihg.store.exception.HotelsStoreException
import com.epam.test_task_ihg.util.HotelsParserJson
import src.bean.Hotel
import src.store.HotelStore
import src.util.impl.FileReaderImpl
import src.util.impl.JsonParser

class HotelStoreImpl implements HotelStore {
    private List<Hotel> hotelsList
    @Override
    void init() {
        try {
            InputStream input = new FileInputStream(Constants.PROPERTY_PATH)

            Properties prop = new Properties()


            prop.load(input)

            JsonParser jsonParser = new JsonParser()
            FileReaderImpl fileReader = new FileReaderImpl()

            String fileContent = fileReader.readFile(prop.getProperty(Constants.PROPERTY_NAME_PATH_JSON))
            hotelsList = jsonParser.parseJsonToHotelsList(fileContent)

        } catch (IOException e) {
            throw new HotelsStoreException()
        }
    }

    @Override
    List<Hotel> getHotelsList() {
        hotelsList
    }
}
