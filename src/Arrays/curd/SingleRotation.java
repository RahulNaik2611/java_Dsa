package Arrays.curd;

import java.util.Arrays;
import java.util.Scanner;

public class SingleRotation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the data here in array:  ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(rotationarray(arr, size)));
        sc.close();
    }
    public static int[] rotationarray(int data[] ,int size )
    {
        int firstelemrnt = data[0];

        for (int i = 1; i <data.length ; i++)
        {
            data[i-1] = data[i];

        }
        data[size - 1 ] = firstelemrnt;
        return data;
    }
}
