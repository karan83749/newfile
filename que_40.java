import java.util.Scanner;

public class que_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is prime
    boolean isPrime = isPrime(number);

        // Display the result
        if (isPrime) {
System.out.println(number + " is a prime number.");
        } else {
System.out.println(number + " is not a prime number.");
        }

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i * i<= number; i++) {
            if (number % i == 0) {
                return false; // The number is divisible by i, so it's not prime
            }
        }

        return true; // The number is prime
    }
}

