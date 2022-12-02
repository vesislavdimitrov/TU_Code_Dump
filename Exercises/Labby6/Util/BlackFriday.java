package Util;

import java.io.IOException;

public class BlackFriday {

        public static Electronics[] electronics;
        public static Book[] books;

        public static void processSales() {
            ProductLoader productLoader = new ProductLoader();
            try {
                Object[] products = productLoader.importDataFromFile();
                int electronicsCount = 0; int currentIndexElectronics = 0;
                int booksCount = 0; int currentIndexBooks = 0;
                for (Object product : products) {
                    if (product instanceof Electronics) {
                        electronicsCount++;
                    }
                    if (product instanceof Book) {
                        booksCount++;
                    }
                }
                electronics = new Electronics[electronicsCount];
                books = new Book[booksCount];
                for (Object product : products) {
                    if (product instanceof Electronics) {
                        electronics[currentIndexElectronics] = (Electronics) product;
                        currentIndexElectronics++;
                    }
                    if (product instanceof Book) {
                        books[currentIndexBooks] = (Book) product;
                        currentIndexBooks++;
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }


}
