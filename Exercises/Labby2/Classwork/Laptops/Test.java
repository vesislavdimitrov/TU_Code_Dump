public class Test {

    public static void main(String[] args) {

        Laptop pc1 = new Laptop(2,"i7 7800K",500,32);
        Laptop pc2 = new Laptop(1,"i5 6500",300,16);

        System.out.println("Laptop 2 is better than laptop1? \n "+pc2.isBetter(pc1));

        //toString() is used by default
        System.out.println(pc1);



    }













}
