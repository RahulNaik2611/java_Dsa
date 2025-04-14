package Arrays.curd;

import java.util.Scanner;

public class FindMissingElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the data into arrays (with one element missing from 1 to " + (size + 1) + "):");
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        FindMissingElementArray myobj = new FindMissingElementArray();
        int missing = myobj.missingElement(data);
        System.out.println("Missing element is: " + missing);
    }

    public int missingElement(int[] data) {
        int n = data.length + 1;  // Because one number is missing
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < data.length; i++) {
            xor1 ^= data[i];     // XOR of array elements
            xor2 ^= (i + 1);     // XOR of numbers from 1 to n-1
        }

        xor2 ^= n;               // Include the last number n
        return xor1 ^ xor2;      // Missing number
    }
}
