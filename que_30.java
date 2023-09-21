
import java.util.Scanner;

public class que_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(inputString);

        // Display the reversed string
System.out.println("Reversed string: " + reversedString);

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right positions
            char temp = charArray[left];
charArray[left] = charArray[right];
charArray[right] = temp;

            // Move indices toward each other
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
