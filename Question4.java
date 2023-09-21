
import java.util.Scanner;

//4. WAP to calculate Area Of Isosceles Triangle 
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the equal sides (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter the length of the base (b): ");
        double b = sc.nextDouble();
        double s = (a + a + b) / 2;
        double area = Math.sqrt(s * (s - a) * (s - a) * (s - b));
        System.out.println("The area of the isosceles triangle is: " + area);
        sc.close();
    }

}
