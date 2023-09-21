
import java.util.*;

class que_49 {
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

reverseArray(arr);

System.out.println("Reversed array:");
        for (int i = 0; i< size; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
    }
}
