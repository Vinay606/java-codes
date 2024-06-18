package arrays;

import java.net.StandardSocketOptions;
import java.util.Arrays;

public class Rotate_array
{
    public static void main(String[] ar)
    {
        int[] arr = {1,2,3,4,5};
        int k=2;
        int[] rot_arr= new int[arr.length];
        for(int i =k+1,j=0;i<arr.length;i++,j++)
        {
            rot_arr[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));

        int t = k;
        for(int i=0; i<=t;i++,k++)
        {
            rot_arr[k] = arr[i];

        }

        System.out.println(Arrays.toString(rot_arr));

        // chat GPT corrected approach
        //        k = k % arr.length;
        //        int[] rot_arr = new int[arr.length];
        //
        //        // Copy the last k elements to the beginning of rot_arr
        //        for (int i = 0; i < k; i++) {
        //            rot_arr[i] = arr[arr.length - k + i];
        //        }
        //
        //        // Copy the first (arr.length - k) elements to the end of rot_arr
        //        for (int i = k; i < arr.length; i++) {
        //            rot_arr[i] = arr[i - k];
        //        }


    }

}
