package arrays;

import java.util.*;

public class Repeating_ele {
    public static void main(String[] ar)
    {
        int[] arr = {4,5,4,1,2,2,3,3,9,8,1,6,0};

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value >1)
                System.out.println(map.get(key));
        }
    }

}
