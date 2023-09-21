//WAP to calculate Perimeter Of Circle 

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
        scanner.close();
    }
}
