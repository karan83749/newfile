//. WAP to calculate Perimeter Of Rhombus 

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of one side of the rhombus: ");
        double sideLength = scanner.nextDouble();
        double perimeter = 4 * sideLength;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
        scanner.close();
    }
}
