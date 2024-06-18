package arrays;

import java.util.Scanner;

public class Array_Min_Ele {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        //reading array elements
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }

        //finding min ele
        int min = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min ele is "+min);
        s.close();
    }

}
