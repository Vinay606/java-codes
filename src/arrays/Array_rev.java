package arrays;

import java.util.Arrays;

public class Array_rev
{

        public static void main(String[] args)
        {
            int[] arr = {1, 4, 5, 2, 77};
            int[] arr_2 = new int[arr.length];
            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++)
            {
                arr_2[j] += arr[i];
            }
            System.out.println(Arrays.toString(arr_2));
        }

}

