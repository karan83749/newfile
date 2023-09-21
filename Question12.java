//WAP to calculate Perimeter Of Square 

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double perimeter = 4 * sideLength;
        System.out.println("The perimeter of the square is: " + perimeter);
        scanner.close();
    }
}
