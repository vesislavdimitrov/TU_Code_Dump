import java.util.ArrayList;

public class Test {

    public static void main(String[] args)
    {


        Car[] carsArray = new Car[5];

        carsArray[0] = new Car("VW","Golf",2006);
        carsArray[1] = new Car("VW","Polo",2006);
        carsArray[2] = new Car("BMW","335i",2012);
        carsArray[3] = new Car("Hyundai","Tucson",2012);
        carsArray[4] = new Car("VW","Golf",2012);

        System.out.println("--------------------------------------------");
        System.out.println("        All cars currently in stock: ");
        System.out.println("--------------------------------------------");
        for(Car i: carsArray)
        {
            i.displayDataForCar();
        }
        System.out.println("--------------------------------------------");



        char ch ='V';
        ArrayList<Car> filteredCars = Car.filteredArray(carsArray, ch);
        System.out.println("--------------------------------------------");
        System.out.println("Cars starting with the same first letter: ("+ch+")");
        System.out.println("--------------------------------------------");
        for(Car c : filteredCars) {
            c.displayDataForCar();
        }
        System.out.println("--------------------------------------------");


    }



















}
