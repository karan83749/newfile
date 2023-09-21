import java.util.Scanner;

public class que_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Calculate the sum
        double sum = number1 + number2;

        // Display the result
System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner to prevent resource leak
scanner.close();
    }
}
