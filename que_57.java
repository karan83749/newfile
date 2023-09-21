import java.util.*;
class que_57 {
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

quickSort(arr, 0, size - 1);

System.out.println("Sorted array:");
        for (int i = 0; i< size; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot element such that element smaller than pivot are on the left and elements greater than pivot are on the right
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
quickSort(arr, low, pivotIndex - 1);
quickSort(arr, pivotIndex + 1, high);
        }
    }
        public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
arr[i + 1] = arr[high];
arr[high] = temp;

        return i + 1;
    }
}