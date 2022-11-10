public class Main {

    public static void main(String[] args) throws PriceException, PowerException {

        TV tv = new TV(100,"x","y","z",300);
        Book book = new Book(100,"x","y","z");

        //will force the exception
        //tv.setPrice(0);

        System.out.println(tv.checkPromo());
        System.out.println(book.checkPromo());

    }
}
