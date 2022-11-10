public class Main {
    public static void main(String[] args) throws FloorsException {


        House house1 = new House(20,400,"x",6,"Ivan");
        House house2 = new House(30,290,"x",5,"Petar");

        House[] houses = {house1,house2};

        System.out.println(House.getLargest(houses));






    }
}