import java.util.*;

class que_46 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = read.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

System.out.println("Temperature in Celsius: " + celsius);
    }
}