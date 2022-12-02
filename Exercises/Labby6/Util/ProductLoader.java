package Util;

import Exceptions.WrongPhoneNumberException;
import Interfaces.ImportData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader implements ImportData {

        private final String filePath = "salesproducts.txt";

        @Override
        public Object[] importDataFromFile() throws IOException {
            Object[] result = new Object[getNumberOfRows()];
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            int index = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("#");
                switch (data[0]) {
                    case "1":
                        Electronics electronics = null;
                        electronics = new Electronics(data[3], Double.parseDouble(data[4]), Integer.parseInt(data[5]),
                                new Provider(data[1], data[2]), data[6], data[7]);
                        result[index] = electronics;
                        index++;
                        break;
                    case "2":
                        Book book;
                        book = new Book(data[3], Double.parseDouble(data[4]), Integer.parseInt(data[5]),
                                new Provider(data[1], data[2]), data[6], data[7]);
                        result[index] = book;
                        index++;
                        break;
                }
            }
            bufferedReader.close();
            return result;
        }

        private int getNumberOfRows() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            int lines = 0;
            while (bufferedReader.readLine() != null) {
                lines++;
            }
            bufferedReader.close();
            return lines;
        }
}
