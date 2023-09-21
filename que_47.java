import java.util.*;

class que_47 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter a string:");
        String input = read.nextLine().toLowerCase(); // Convert the input to lowercase for case insensitivity

        int vowelCount = 0;

        for (int i = 0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowelCount++;
            }
        }

System.out.println("Number of vowels in the string: " + vowelCount);
    }
}