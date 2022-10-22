import java.util.Scanner;
import java.util.ArrayList;


public class Car
{
    String make;
    String model;
    int year;


    public Car(String brand, String model,int year) {

        this.make = brand;
        this.model = model;
        this.year = year;
    }


    public int getYear() {
        return year;
    }
    public void setYear(int year) {this.year = year;}
    public String getModel() {return model;}
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String brand) {
        this.make = brand;
    }


    public static ArrayList<Car> filteredArray(Car[] carsArray, char ch) {
        ArrayList<Car> filteredCars = new ArrayList<Car>();
        for (Car i : carsArray) {
            if (i.getMake().charAt(0) == ch) {
                filteredCars.add(i);
            }
        }
        return (filteredCars);
    }

    public void displayDataForCar()
    {
        System.out.println(this.getMake()+" "+this.getModel()+" "+this.getYear());
    }



















}
