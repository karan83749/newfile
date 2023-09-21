import java.util.*;

class que_45 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter a decimal number:");
        int decimalNum = read.nextInt();

        // Convert decimal to binary
        String binaryStr = Integer.toBinaryString(decimalNum);

System.out.println("Binary equivalent: " + binaryStr);
    }
}
