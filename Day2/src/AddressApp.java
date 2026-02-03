import java.util.Scanner;

public class AddressApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Please enter your house number: ");
        String houseNum = scanner.nextLine();

        System.out.print("Please enter your road name: ");
        String roadName = scanner.nextLine();

        System.out.print("Please enter your town: ");
        String town = scanner.nextLine();

        System.out.printf("""
                Mr and Mrs %s,
                %s, %s
                %s
                """, surname, houseNum, roadName, town);
    }
}
