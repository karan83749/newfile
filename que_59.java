
import java.util.*;

class que_59 {
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

heapSort(arr);

System.out.println("Sorted array:");
        for (int i = 0; i< size; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i>= 0; i--) {
heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i> 0; i--) {
            // Swap the current root (maximum element) with the last element
            int temp = arr[0];
arr[0] = arr[i];
arr[i] = temp;

            // Call heapify on the reduced heap
heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // If left child is larger than the root
        if (leftChild< n &&arr[leftChild] >arr[largest]) {
            largest = leftChild;
        }

        // If right child is larger than the largest so far
        if (rightChild< n &&arr[rightChild] >arr[largest]) {
            largest = rightChild;
        }

        // If the largest is not the root
        if (largest != i) {
            int swap = arr[i];
arr[i] = arr[largest];
arr[largest] = swap;

            // Recursively heapify the affected sub-tree
heapify(arr, n, largest);
        }
    }
}
