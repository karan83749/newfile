import java.util.Scanner;

public class que_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number


        // Display the result
        if (isPerfectNumber(number)) {
System.out.println(number + " is a perfect number.");
        } else {
System.out.println(number + " is not a perfect number.");
        }

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Perfect numbers are positive integers
        }

        int sumOfDivisors = 0;

        for (int i = 1; i<= number / 2; i++) {
            if (number % i == 0) {
sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }
}
