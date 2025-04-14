package Arrays.curd;

import java.util.Arrays;
import java.util.Scanner;

public class NthRotations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array");
        int size = sc.nextInt();
        System.out.println("Enter the number rotation here : ");
        int n = sc.nextInt();
        System.out.println("Enter the data in array");
        int data[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            data[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(rotationgarray(data,size,n)));


    }
    public static int[] rotationgarray(int data [] ,int size ,int n)
    {
        int result[] = new int[size];

        n = n%size;
        for (int i = 0; i < size; i++)
        {
            result[i] = data[(i + n ) % size];

        }

        return result;


    }
}
