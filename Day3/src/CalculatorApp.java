import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the second integer: ");
        int num2  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The result is: " + ((float) num1 / num2));
    }
}
