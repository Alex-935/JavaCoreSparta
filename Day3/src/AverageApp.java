import java.util.Scanner;

public class AverageApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first integer: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the second integer: ");
        int num2  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the third integer: ");
        int num3  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the fourth integer: ");
        int num4  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The result is: " + ((float) num1 + num2 + num3 + num4) / 4);
    }


}
