//3.WAP to calculate Area Of Rectangle  

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}
