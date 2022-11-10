public abstract class Products {

    private double price;
    private String id;

    public Products(double price, String id) throws PriceException{

        setPrice(price);
        setId(id);


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {

        if(price<=0){
            throw new PriceException();
        }else{
            this.price = price;
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double checkPromo() throws PriceException;
}