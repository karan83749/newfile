//WAP to calculate Volume Of
import java.util.Scanner;

public class Question16 {
    public static double calculateCylinderVolume(double radius, double height) {
        double pi = 3.14159;
        double volume = pi * Math.pow(radius, 2) * height;
        return volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("The volume of the cylinder is: " + volume);
        scanner.close();
    }
}
