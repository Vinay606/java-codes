package arrays;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        // using hashmap
        int[] array = {5,5,8,3,5,6,7,8,3,4,6,7};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : array)
        {
        if(map.containsKey(num))
        {
            map.put(num, map.get(num)+1);
        }
        else {
            map.put(num,1);
        }
        }
        //iterate through map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }


    }

}
