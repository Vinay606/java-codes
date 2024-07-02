package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class Sorting_Elements_byFrequency {
    public static void main(String ar[])
    {
        int[] arr = {1,5,2,4,1,3,3,5,4,3,3,5};

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr)
            map.put(num, map.getOrDefault(num,0)+1);

        List<Integer> list = new ArrayList<>();
        for(int num : arr)
            list.add(num);

        list.sort((a, b) ->
        {
            int freqA = map.get(a);
            int freqB = map.get(b);
            return freqA!=freqB? freqB - freqA : b - a;
        });

        System.out.println(list);
    }
}
