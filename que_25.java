import java.util.Scanner;

public class que_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount, annual interest rate, time, and compounding frequency
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the compounding frequency (e.g., 12 for monthly): ");
        int compoundingFrequency = scanner.nextInt();

        // Calculate compound interest
        double compoundInterest = calculateCompoundInterest(principal, annualRate, time, compoundingFrequency);

        // Display the result
        System.out.printf("The compound interest is: %.2f%n", compoundInterest);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to calculate compound interest
    public static double calculateCompoundInterest(double principal, double annualRate, double time,
            int compoundingFrequency) {
        double ratePerPeriod = annualRate / compoundingFrequency;
        int totalPeriods = compoundingFrequency * (int) time;
        double compoundInterest = principal * Math.pow(1 + ratePerPeriod, totalPeriods) - principal;
        return compoundInterest;
    }
}