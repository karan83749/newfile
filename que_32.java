import java.util.Scanner;

public class que_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the LCM
        int lcm = findLCM(num1, num2);

        // Display the result
System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to find the LCM using the GCD formula
    public static int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return Math.abs(num1 * num2) / gcd;
    }

    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
