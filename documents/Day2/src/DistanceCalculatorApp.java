import java.util.Scanner;
import java.lang.Math;

public class DistanceCalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float u, t, a;

        System.out.print("What is the initial velocity?: ");
        u = Float.valueOf(scanner.nextLine());

        System.out.print("What is the acceleration?: ");
        a = Float.valueOf(scanner.nextLine());

        System.out.print("What is the time taken?: ");
        t = scanner.nextFloat();

        double s = ((u * t) + 0.5 * a * Math.pow(t, 2));

        System.out.printf("The speed is: %.2f", s);

    }
}
