//WAP to calculate Volume Of Cone  

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cone's base (in meters): ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cone (in meters): ");
        double height = scanner.nextDouble();
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cone is: " + volume + " cubic meters");
        scanner.close();
    }
}
