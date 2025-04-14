package Arrays.curd;

import java.util.Scanner;

public class SecondLargest_Element
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array data : ");
        int data[] = new int[size];
        for (int i = 0; i <size ; i++)
        {
            data[i] = sc.nextInt();

        }

        System.out.println(FetchSecondhigest(data,size));

    }
    public static int largestElemnt(int data[],int size)
    {
        int largest = data[0];
        for (int i = 1; i < data.length; i++)
        {
            if (largest < data[i])
            {
                largest = data[i];
            }

        }
        return  largest;
    }

    public static  int FetchSecondhigest(int data[],int size)
    {
        int largesthigest = largestElemnt(data, size);
        int secondhigest = Integer.MIN_VALUE;

        for (int i = 0; i <size ; i++)
        {
            if (secondhigest < data[i] && largesthigest != data[i])
            {
                secondhigest = data[i];
            }

        }
        return  secondhigest;


    }
}
