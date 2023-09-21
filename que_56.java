import java.util.*;

class que_56 {
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
        for (int i = 0; i < size; i++) {
            arr[i] = read.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already
            // sorted
            if (!swapped) {
                break;
            }
        }
    }
}
