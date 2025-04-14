package Arrays.curd;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayisSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the data into array: ");
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        boolean isSorted = isArraySorted(data, size);
        System.out.println("Array: " + Arrays.toString(data));
        System.out.println("Is the array sorted? " + isSorted);
    }

    public static boolean isArraySorted(int[] data, int size) {
        if (size <= 1) {
            return true; // Empty or single-element array is considered sorted
        }

        // Check for ascending order
        for (int i = 1; i < size; i++) {
            if (data[i] < data[i-1]) {
                return false;
            }
        }
        return true;
    }
}