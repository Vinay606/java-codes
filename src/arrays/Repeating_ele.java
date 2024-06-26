package arrays;

import com.sun.jdi.Value;

import java.util.*;

public class Repeating_ele {
    public static void main(String[] ar)
    {
        int[] arr = {4,5,4,1,2,2,3,3,9,8,1,6,0};

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else
                map.put(j, 1);
        }

        /*
        * for(int i=0;i<=n-1;i++)
        * map.put(arr[i], getOrDefault(arr[i], 0)+1);
        * */

        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value >1)
                System.out.println(key +" "+value);
        }
    }

}
