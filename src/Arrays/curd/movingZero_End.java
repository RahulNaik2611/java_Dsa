package Arrays.curd;

import java.util.Arrays;
import java.util.Scanner;

public class movingZero_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        System.out.println("Enter the data into array: ");
        int data[] = new int[size];

        for (int i = 0; i < size; i++) {  // Fixed: changed 'u' to 'i'
            data[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moving(data, size)));
    }

    private static int[] moving(int[] data, int size) {
        int j = -1;
        // Find the first zero
        for (int i = 0; i < size; i++) {
            if (data[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return data; // No zeros found

        // Move non-zero elements to the front
        for (int i = j + 1; i < size; i++) {
            if (data[i] != 0) {
                // Swap elements at positions i and j
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                j++;
            }
        }
        return data;
    }
}