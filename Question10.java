//WAP to calculate Perimeter Of Parallelogram 

import java.util.Scanner;

public class Question10 {
    public static double calculateParallelogramPerimeter(double base, double side) {
        return 2 * (base + side);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the length of one of the adjacent sides of the parallelogram: ");
        double side = scanner.nextDouble();
        double perimeter = calculateParallelogramPerimeter(base, side);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
        scanner.close();
    }

}
