package Arrays.curd;

import java.util.Scanner;

public class Smallet_second_number
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of array here : ");
        int size = sc.nextInt();
        System.out.println("Enter the array data here : ");
        int data[] = new int[size];

        for (int i = 0; i < size; i++)
        {
            data[i] = sc.nextInt();

        }

        System.out.println(secondsmallest(data,size) + " Second Small elements ");
    }

    private static int  smallestnumber(int[] data, int size)
    {
        int smallest_number = data[0];

        for (int i = 1; i < data.length; i++)
        {
            if (smallest_number > data[i])
            {
                smallest_number = data[i];
            }

        }
        return smallest_number;
    }
    public static int secondsmallest(int data[],int size )
    {
        int smallestElement = smallestnumber(data,size);
        int secondsmallestElement = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++)
        {
            if (secondsmallestElement > data[i] && smallestElement !=data[i])
            {
                secondsmallestElement = data[i];
            }

        }
        return secondsmallestElement;

    }

}
