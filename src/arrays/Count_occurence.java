package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Count_occurence{
    public static void main(String[] ar)
    {
        int[] arr = {2,4,2,6,5,8,5,6,8,2,};

        boolean[] counted = new boolean[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(!counted[i])
            {
                int count =1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])

                    {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] +"counts:"+count);
                System.out.println(Arrays.toString(counted));
            }
        }
    }

}
