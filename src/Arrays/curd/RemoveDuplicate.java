package Arrays.curd;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] data = new int[size];

        System.out.println("Enter data into array: ");
        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(data, size);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static int removeDuplicates(int[] data, int size) {
        if (size == 0 || size == 1)
            return size;

        Arrays.sort(data);

        int j = 0;
        for (int i = 1; i < size; i++) {
            if (data[i] != data[j]) {
                j++;
                data[j] = data[i];
            }
        }

        return j + 1; // New size of array without duplicates
    }
}
