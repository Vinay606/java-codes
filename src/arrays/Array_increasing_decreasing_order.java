package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_increasing_decreasing_order {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,4,8,7,9,8,6,2};
        int n= arr.length;
        rearrangeArray(arr, n);
    }

    private static void rearrangeArray(int[] arr, int n)
    {
        Arrays.sort(arr);
       int[] new_arr = new int[n];
       for(int i=0;i<=n/2-1;i++)
       {
           new_arr[i] = arr[i];

       }
        System.out.println(Arrays.toString(new_arr));
       for(int i=n-1,j=n/2;i>=n/2;i--,j++)
       {
           new_arr[j] = arr[i];

       }
        System.out.println(Arrays.toString(new_arr));

    }
}
