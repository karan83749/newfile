import java.util.Scanner;

public class que_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the HCF
        int hcf = findHCF(num1, num2);

        // Display the result
System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to find the HCF using the Euclidean algorithm
    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}