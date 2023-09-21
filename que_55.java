import java.util.*;

class que_55 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter the size of the array:");
        int size = read.nextInt();

        if (size <= 0) {
System.out.println("Invalid array size. Please enter a positive size.");
            return;
        }

        int[] arr = new int[size];

System.out.println("Enter the elements of the array:");
        for (int i = 0; i< size; i++) {
arr[i] = read.nextInt();
        }

selectionSort(arr);

System.out.println("Sorted array:");
        for (int i = 0; i< size; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i< n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <arr[minIndex]) {
minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
arr[minIndex] = arr[i];
arr[i] = temp;
        }
    }
}
