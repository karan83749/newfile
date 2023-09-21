//package DataStructureUsingJAVA.AssignmentSEM3;


import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount: ");
        double discountPercentage = scanner.nextDouble();
        double discount = (originalPrice * discountPercentage) / 100.0;
        double discountedPrice = originalPrice - discount;
        System.out.println("Discounted Price: " + discountedPrice);
        scanner.close();
    }
}