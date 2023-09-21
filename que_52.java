import java.util.*;

class que_52 {
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

System.out.println("Enter the element to search:");
        int elementToSearch = read.nextInt();

        int index = linearSearch(arr, elementToSearch);

        if (index != -1) {
System.out.println("Element found at index: " + index);
        } else {
System.out.println("Element not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == element) {
                return i; // Return the index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}
