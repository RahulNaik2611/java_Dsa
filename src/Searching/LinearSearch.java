package Searching;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the data of array here ");
        int data[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            data[i] = sc.nextInt();

        }
        System.out.println("Enter the target here : ");
        int target = sc.nextInt();

        System.out.println(" index of your target : " + " " +linearsearch(data,target));
    }

    private static int linearsearch(int[] data, int target)
    {
        int indexing  = 0;
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == target)
            {
                indexing = i;
            }

        }
        return   indexing;

    }
}
