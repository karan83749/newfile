//AP to calculate Area Of Rhombus 

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first diagonal (d1): ");
        double d1 = sc.nextDouble();
        System.out.println("Enter the length of the second diagonal (d2): ");
        double d2 = sc.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("The area of the rhombus is: " + area);
        sc.close();
    }
}
