
import java.util.*;

class que_58 {
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

insertionSort(arr);

System.out.println("Sorted array:");
        for (int i = 0; i< size; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i< n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 &&arr[j] > key) {
arr[j + 1] = arr[j];
                j--;
            }

arr[j + 1] = key;
        }
    }
}

