package arrays;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] ar)
    {
    int[] arr = {1,4,6,8,6,7,94,67};
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if (arr[i]>arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

        System.out.println(Arrays.toString(arr));
    }
}
