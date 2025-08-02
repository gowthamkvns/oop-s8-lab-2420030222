package lab1;
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Volume of the sphere: %.2f cubic units\n", volume);
        scanner.close();
    }
}