package lab3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try {
            LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
            LocalDateTime now = LocalDateTime.now();

            if (eventDateTime.isBefore(now)) {
                System.out.println("The event has already passed.");
            } else {
                Duration duration = Duration.between(now, eventDateTime);
                long totalMinutes = duration.toMinutes();
                long days = totalMinutes / (24 * 60);
                long hours = (totalMinutes % (24 * 60)) / 60;
                long minutes = totalMinutes % 60;

                System.out.printf("Time remaining until event:\n%2d days, %2d hours, and %2d minutes\n", days, hours, minutes);
            }
        } catch (Exception e) {
            System.out.println("Invalid format. Please enter in yyyy-MM-dd HH:mm format.");
        }

        sc.close();
    }
}
