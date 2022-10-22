import java.util.*;

public class BMICalc
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
       
        printIntroduction();
        double bmi = getBMI(scan);
        String status = getStatus(bmi);

        ReportResults(bmi, status);

        scan.close();
    }

    static void printIntroduction()
    {
        System.out.println("Welcome to Body Mass Index Calculator v1.0!");
    }

    static double getBMI(Scanner scan)
    {
        System.out.println("Enter your weight (in kg): ");
        double weight = scan.nextDouble();
        weight = (weight*2.2046);

        System.out.println("Enter your height (in cm): ");
        double height = scan.nextDouble();
        height = (height*0.3937);

        return bmiFor(weight, height);
    }

    static double bmiFor(double weight, double height)
    {
        return weight*703/ (height*height);
    }

    static String getStatus(double bmi)
    {
        String status;

        if(bmi< 18.5) status = "underweight";
        else if(bmi< 25) status = "normal";
        else if(bmi< 30) status = "overweight";
        else if(bmi> 30) status = "obese";
        else status = "Error";



        return status.toUpperCase();
    }

    static void ReportResults (double bmi, String status)
    {
        System.out.printf("You nave a BMI of %.2f and your status is: %s", bmi, status);
    }


}
