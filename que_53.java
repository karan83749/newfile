
import java.util.*;

class que_53 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("Enter the size of the sorted array:");
        int size = read.nextInt();

        if (size <= 0) {
System.out.println("Invalid array size. Please enter a positive size.");
            return;
        }

        int[] arr = new int[size];

System.out.println("Enter the elements of the sorted array in ascending order:");
        for (int i = 0; i< size; i++) {
arr[i] = read.nextInt();
        }

System.out.println("Enter the element to search:");
        int elementToSearch = read.nextInt();

        int index = binarySearch(arr, elementToSearch);

        if (index != -1) {
System.out.println("Element found at index: " + index);
        } else {
System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                return mid; // Element found, return the index
            } else if (arr[mid] < element) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
