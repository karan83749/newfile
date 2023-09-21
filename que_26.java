import java.util.Scanner;

public class que_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize an array to store marks
        double[] marks = new double[numSubjects];

        // Input marks for each subject
        for (int i = 0; i<numSubjects; i++) {
System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Calculate the average
        double average = calculateAverage(marks);

        // Display the result
System.out.printf("The average marks is: %.2f%n", average);

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to calculate the average of an array of marks
    public static double calculateAverage(double[] marks) {
        double sum = 0.0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

