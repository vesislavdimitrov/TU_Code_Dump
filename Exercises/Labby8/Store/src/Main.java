import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Product1 pr1 = new Product1("X",23.5,1,10);
        Product2 pr2 = new Product2("Y",44.5,2,7);

        PresentStore pr = new PresentStore();
        Collections.addAll(pr.productsList,pr1,pr2);
        Collections.addAll(pr.devAPIList,pr1,pr2);

        ArrayList<GetProductsTo> getProducts = pr.getProductPrice(30);
        ArrayList<DeliveryAPI> devApi = pr.getProductsById(1);
        System.out.println(getProducts);
        System.out.println(devApi);
    }
}