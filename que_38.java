
import java.util.Scanner;

public class que_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrix
System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the original matrix
        int[][] originalMatrix = new int[rows][columns];

        // Input elements of the original matrix
System.out.println("Enter elements of the matrix:");
inputMatrixElements(scanner, originalMatrix);

        // Calculate the transpose of the matrix
        int[][] transposeMatrix = transpose(originalMatrix);

        // Display the original and transpose matrices
System.out.println("Original Matrix:");
displayMatrix(originalMatrix);

System.out.println("Transpose Matrix:");
displayMatrix(transposeMatrix);

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to input elements of a matrix
    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to calculate the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < columns; j++) {
transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Method to display the elements of a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < columns; j++) {
System.out.print(matrix[i][j] + " ");
            }
System.out.println();
        }
    }
}
