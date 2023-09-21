import java.util.Scanner;

public class que_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number


        // Display the result
        if (isArmstrong(number)) {
System.out.println(number + " is an Armstrong number.");
        } else {
System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
