//5.WAP to calculate Area Of Parallelogram 


import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base length of the parallelogram: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
        sc.close();

    }
}
