import java.util.Scanner;

    public class que3 {
            public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle:");
            float length = read.nextFloat();
            System.out.println("Enter the width of the rectangle:");
            float width = read.nextFloat();
            System.out.println("Area is: " + (length * width));
        }
    }
