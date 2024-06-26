package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Median_array {
    public static void main(String[] ar)
    {
        double median;
        int[] arr = {1,2,3,4,5,6,5};
        Arrays.sort(arr);
        int n= arr.length;
        if(n%2==0)
        {
            median = (double)(arr[n/2] + arr[n/2-1]) /2;
        }
        else {
            median = arr[n/2];
        }

        System.out.println(median);

    }
}
