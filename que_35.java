import java.util.Scanner;

public class que_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        // Input dimensions of the second matrix
System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
System.out.println("Matrix multiplication is not possible. The number of columns in matrix A must be equal to the number of rows in matrix B.");
scanner.close();
            return;
        }

        // Input elements of matrix A
System.out.println("Enter elements of matrix A:");
        int[][] matrixA = new int[rowsA][colsA];
        for (int i = 0; i<rowsA; i++) {
            for (int j = 0; j <colsA; j++) {
matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input elements of matrix B
System.out.println("Enter elements of matrix B:");
        int[][] matrixB = new int[rowsB][colsB];
        for (int i = 0; i<rowsB; i++) {
            for (int j = 0; j <colsB; j++) {
matrixB[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result
System.out.println("Result of matrix multiplication (A * B):");
        for (int i = 0; i<rowsA; i++) {
            for (int j = 0; j <colsB; j++) {
System.out.print(resultMatrix[i][j] + " ");
            }
System.out.println();
        }

        // Close the scanner to prevent resource leak
scanner.close();
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i<rowsA; i++) {
            for (int j = 0; j <colsB; j++) {
                for (int k = 0; k <colsA; k++) {
resultMatrix[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return resultMatrix;
    }
}
