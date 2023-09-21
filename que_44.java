import java.util.*;

class que_44 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter a decimal number:");
        int decimalNum = read.nextInt();

        // Convert decimal to octal
        String octalStr = Integer.toOctalString(decimalNum);

System.out.println("Octal equivalent: " + octalStr);
    }
}