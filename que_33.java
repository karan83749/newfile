import java.util.Scanner;

public class que_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Check if the character is a vowel or a consonant


        // Display the result
        if (isVowel(character)==true) {
System.out.println(character + " is a vowel.");
        } else {
System.out.println(character + " is a consonant.");
        }

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
