import java.util.*;
class que_43 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter a decimal number:");
        int decimalNum = read.nextInt();

        // Convert decimal to hexadecimal
        String hexadecimalStr = Integer.toHexString(decimalNum).toUpperCase();

System.out.println("Hexadecimal equivalent: " + hexadecimalStr);
    }
}