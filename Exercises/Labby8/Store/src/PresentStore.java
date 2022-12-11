import java.util.ArrayList;

public class PresentStore {
    public ArrayList<GetProductsTo> productsList = new ArrayList<>();
    public ArrayList<DeliveryAPI> devAPIList = new ArrayList<>();

    public ArrayList<GetProductsTo> getProductPrice(double maxPrice){
        ArrayList<GetProductsTo> list = new ArrayList<>();
        for(GetProductsTo product : productsList){
            if(product.getPrice() < maxPrice){
                list.add(product);
            }
        }
        return list;
    }

    public ArrayList<DeliveryAPI> getProductsById(int givenId){
        ArrayList<DeliveryAPI> list = new ArrayList<>();
        for(DeliveryAPI deliveryAPI : devAPIList){
            if(deliveryAPI.getIdOfProvider() == givenId){
                list.add(deliveryAPI);
            }
        }
        return list;
    }
}
