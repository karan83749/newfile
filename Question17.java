//WAP to calculate Volume Of Sphere 

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
        input.close();
    }
}
