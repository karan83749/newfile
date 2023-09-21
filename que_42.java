import java.util.*;

class que_42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter an octal number:");
        String octalStr = read.next();

        // Convert octal to decimal
        int decimalNum = Integer.parseInt(octalStr, 8);

        // Convert decimal to hexadecimal
        String hexadecimalStr = Integer.toHexString(decimalNum).toUpperCase();

System.out.println("Hexadecimal equivalent: " + hexadecimalStr);
    }
}