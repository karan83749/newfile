import java.util.*;

class que_41 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter a positive integer:");
        int num = read.nextInt();

        if (num < 0) {
System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += digit; // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }

System.out.println("Sum of the digits is: " + sum);
    }
}