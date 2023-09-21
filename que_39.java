import java.util.Scanner;

public class que_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a year
System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year

        // Display the result
        if (booleanisLeapYear(year)==true) {
System.out.println(year + " is a leap year.");
        } else {
System.out.println(year + " is not a leap year.");
        }

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean booleanisLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}