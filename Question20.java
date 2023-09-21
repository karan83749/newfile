//WAP to calculate Average Of N Numbers 


import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = input.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.println("The average is: " + average);
        input.close();
    }

}
