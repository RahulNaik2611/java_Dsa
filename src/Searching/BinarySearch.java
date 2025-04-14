package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size Here: ");
        int size = sc.nextInt();

        System.out.println("Enter the data into array here : ");
        int data[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            data[i] = sc.nextInt();

        }
        System.out.println("Give target value here : ");
        int target = sc.nextInt();
        System.out.println(searching(data,target));


    }

    private static int searching(int[] data,int target)
    {
        //Binary search work for sorted array
        Arrays.sort(data);
        System.out.println("Array after array : " + Arrays.toString(data));
        int low = 0;
        int high = data.length-1;
        while (low <= high)
        {
            int mid = (low + high) /2;
            if (data[mid] == target )
            {
                return mid;
            } else if (target > data[mid])
            {
                return low = mid + 1;

            }
            else {
                return high = mid -1;
            }
        }
        return  -1;


    }
}
