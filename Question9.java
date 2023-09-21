//WAP to calculate Perimeter Of Equilateral Triangle 

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of one side of the equilateral triangle: ");
        double sideLength = input.nextDouble();
        double perimeter = 3 * sideLength;
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
        input.close();
    }
}
