package src.util.impl

import src.constants.Constants
import src.util.FileReader

class FileReaderImpl implements FileReader {


    @Override
    String readFile(String pathToFile) {
         new File(pathToFile).getText(Constants.CHARSET_UTF8)
    }
}
