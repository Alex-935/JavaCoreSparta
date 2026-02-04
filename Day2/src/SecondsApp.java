import java.util.Scanner;

public class SecondsApp {

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        int hours = minutes / 60;
        minutes %= 60;

        System.out.printf("""
                Input      Hours      Minutes      Seconds
                %-6d    %6d       %6d       %6d
                """, totalSeconds, hours, minutes, seconds);
    }
}
