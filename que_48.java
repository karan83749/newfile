
import java.util.*;

class que_48 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter a number:");
        int number = read.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit
        }

System.out.println("Reversed number: " + reversedNumber);
    }
}