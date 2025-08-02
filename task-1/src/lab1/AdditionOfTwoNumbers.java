package lab1;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning shift earnings (in rupees): ");
        double morningShiftEarnings = scanner.nextDouble();

        System.out.print("Enter evening shift earnings (in rupees): ");
        double eveningShiftEarnings = scanner.nextDouble();

        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

        System.out.println("Total daily earnings: ₹" + totalDailyEarnings);
        scanner.close();
    }
}
