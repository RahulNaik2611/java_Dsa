package Arrays.curd;

import java.util.Scanner;

public class maximumConsecuite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size  = sc.nextInt();
        System.out.println("Enter the data into arrays :  ");
        int data[] = new int[size];

        for (int i = 0; i < data.length; i++) 
        {
            data[i] = sc.nextInt();
            
        }
        System.out.println(consecutive(data, size));

    }

    private static int consecutive(int[] data, int size)
    {
        int maximum = 0;
        int cnt = 0 ;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                cnt++;
                maximum = Math.max(maximum, cnt);
            } else {
                cnt = 0; // Reset count when a 0 is encountered
            }
        }
        


        // TODO Auto-generated method stub
       
    }
    return maximum;
}
