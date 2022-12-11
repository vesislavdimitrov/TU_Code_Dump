public class Product1 implements GetProductsTo,DeliveryAPI{
    public String type;
    public double price;
    public int idOfProvider;
    public int number;

    public Product1(String type, double price, int idOfProvider, int number) {
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
    }

    @Override
    public int getNumber(int idOfProvider) {
        if(this.idOfProvider == idOfProvider){
            return this.number;
        }
        return 0;
    }

    @Override
    public String getType(int idOfProvider) {
        if(this.idOfProvider == idOfProvider){
            return this.type;
        }
        return null;
    }

    @Override
    public int getIdOfProvider() {
        return this.idOfProvider;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", idOfProvider=" + idOfProvider +
                ", number=" + number +
                '}';
    }
}
