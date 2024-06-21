package arrays;

import java.util.Arrays;

public class Count_of_distinct_ele {
    public static void main(String[] ar)
    {
        int[] arr={5,4,76,9,2,34,6,6,1,0};
        int count =1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
                continue;
            else
                count++;
        }

        System.out.println(count);
    }

}
