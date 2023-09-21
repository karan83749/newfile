import java.util.Scanner;

public class que_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize two matrices
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] differenceMatrix = new int[rows][columns];

        // Input elements of matrix A
System.out.println("Enter elements of matrix A:");
inputMatrixElements(scanner, matrixA);

        // Input elements of matrix B
System.out.println("Enter elements of matrix B:");
inputMatrixElements(scanner, matrixB);

        // Perform matrix subtraction
subtractMatrices(matrixA, matrixB, differenceMatrix);

        // Display the result
System.out.println("Result of matrix subtraction (A - B):");
displayMatrix(differenceMatrix);

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

    // Method to subtract two matrices and store the result in a third matrix
    public static void subtractMatrices(int[][] A, int[][] B, int[][] result) {
        int rows = A.length;
        int columns = A[0].length;

        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
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
