import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = getInt("first");
        int num2 = getInt("second");

        System.out.println("The result is: " + ((float) num1 / num2));
    }


    //Asks the user for an integer input and validates it
    public static int getInt(String position) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create variable to
        boolean validated = false;

        do {
            System.out.printf("Please enter the %s integer: ", position);
            //attempt to convert string to int
            try {
                int num = Integer.parseInt(scanner.nextLine());
                //scanner.nextLine();

                return num;
            }
            // if the user didn't input an integer
            catch (NumberFormatException e) {
                System.out.println("Please make sure you enter an integer");
            }

        } while (!validated);

        return -1;
    }

    //Asks the user for an integer input and validates it
    // version for no argument
    static int getInt() {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create variable to
        boolean validated = false;

        do {
            System.out.printf("Please enter the %s integer: ");
            //attempt to convert string to int
            try {
                int num = Integer.parseInt(scanner.nextLine());
                //scanner.nextLine();

                return num;
            }
            // if the user didn't input an integer
            catch (InputMismatchException e) {
                System.out.println("Please make sure you enter an integer");
            }

        } while (!validated);

        return -1;
    }
}
