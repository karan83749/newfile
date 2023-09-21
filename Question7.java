//7.WAP to calculate Area Of Equilateral Triangle 

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle: ");
        double side = sc.nextDouble();
        double area = (side * side * Math.sqrt(3)) / 4.0;
        System.out.println("The area of the equilateral triangle is: " + area);
        sc.close();
    }
}
