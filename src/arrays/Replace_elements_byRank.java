package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Replace_elements_byRank {
    public static void main(String[] ar)
    {
        int arr[]= {2,4,8,99,0,1,54};
        int[] temp =new int[arr.length];
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            temp[i] = arr[i];
        Arrays.sort(temp);
        int val =1;
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(temp[i])==null)
            {
                map.put(temp[i], val);
                val++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ ":"+map.get(arr[i])+",  " );
        }

    }
}
