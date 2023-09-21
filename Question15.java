//WAP to calculate Volume Of Prism 

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base area of the prism: ");
        double baseArea = scanner.nextDouble();
        System.out.print("Enter the height of the prism: ");
        double height = scanner.nextDouble();
        double volume = baseArea * height;
        System.out.println("The volume of the prism is: " + volume);
        scanner.close();
    }
}
