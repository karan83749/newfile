
import java.util.*;

class que_54 {
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

mergeSort(arr, 0, size - 1);

System.out.println("Sorted array:");
        for (int i = 0; i< size; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort the left and right halves
mergeSort(arr, left, mid);
mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i< n1; i++) {
leftArr[i] = arr[left + i];
        }
        for (int i = 0; i< n2; i++) {
rightArr[i] = arr[mid + 1 + i];
        }

        // Merge the two sorted arrays
        int i = 0, j = 0, k = left;
        while (i< n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
arr[k] = leftArr[i];
i++;
            } else {
arr[k] = rightArr[j];
j++;
            }
            k++;
        }

        // Copy remaining elements from leftArr and rightArr if any
        while (i< n1) {
arr[k] = leftArr[i];
i++;
            k++;
        }
        while (j < n2) {
arr[k] = rightArr[j];
j++;
            k++;
        }
    }
}
