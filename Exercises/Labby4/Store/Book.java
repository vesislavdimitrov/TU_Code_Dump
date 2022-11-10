public class Book extends Products{

    private String author;
    private String title;

    public Book(double price, String id,String author, String title) throws PriceException{
        super(price, id);
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
    public double checkPromo() throws PriceException {

        this.setPrice(this.getPrice() - (this.getPrice()*15/100));
        return this.getPrice();
    }
}
