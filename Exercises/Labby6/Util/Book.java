package Util;

import Exceptions.NoMoreProductsException;

public class Book extends Product{

    public final int BOOKS_PROMO = 50;
    private String author;
    private String title;

    public Book(String inventoryNumber, double price, int quantity, Provider provider,
                String author, String title) {
        super(inventoryNumber, price, quantity, provider);
        this.author=author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPromotionalPrice(double promo) {
        return 0;
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        return false;
    }
}
