
import java.util.*;

class que_50 {
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

System.out.println("Enter the element to insert:");
        int elementToInsert = read.nextInt();

System.out.println("Enter the position to insert the element (0-based index):");
        int position = read.nextInt();

        if (position < 0 || position > size) {
System.out.println("Invalid position. Please enter a valid position within the array range.");
            return;
        }

arr = insertElement(arr, elementToInsert, position);

System.out.println("Array after insertion:");
        for (int i = 0; i<arr.length; i++) {
System.out.print(arr[i] + " ");
        }
    }

    public static int[] insertElement(int[] arr, int element, int position) {
        int newSize = arr.length + 1;
        int[] newArr = new int[newSize];

        // Copy elements before the insertion point
        for (int i = 0; i< position; i++) {
newArr[i] = arr[i];
        }

        // Insert the element at the specified position
newArr[position] = element;

        // Copy elements after the insertion point
        for (int i = position + 1; i<newSize; i++) {
newArr[i] = arr[i - 1];
        }

        return newArr;
    }
}