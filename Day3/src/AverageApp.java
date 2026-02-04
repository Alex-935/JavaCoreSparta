import java.util.InputMismatchException;
import java.util.Scanner;



public class AverageApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //get four integers
        int num1 = CalculatorApp.getInt("first");
        int num2  = CalculatorApp.getInt("second");
        int num3 = CalculatorApp.getInt("third");
        int num4 = CalculatorApp.getInt("fourth");

        // by making one number a float, all the others are converted into a float
        System.out.println("The result is: " + ((float) num1 + num2 + num3 + num4) / 4);
    }


}
