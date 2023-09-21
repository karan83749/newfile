import java.util.Scanner;

public class que_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Initialize a variable to store the sum
        int sum = 0;

        // Input N numbers and calculate their sum
        for (int i = 1; i<= N; i++) {
System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        // Display the result
System.out.println("The sum of the " + N + " numbers is: " + sum);

        // Close the scanner to prevent resource leak
scanner.close();
    }
}
