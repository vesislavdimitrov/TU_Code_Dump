package Util;

import Exceptions.NoMoreProductsException;

public class Electronics extends Product{

    public final int ELECTRONICS_PROMO = 10;
    private String manufacturer;
    private String model;

    public Electronics(String inventoryNumber, double price, int quantity,
                       Provider provider, String manufacturer,String model) {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer=manufacturer;
        this.model=model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
