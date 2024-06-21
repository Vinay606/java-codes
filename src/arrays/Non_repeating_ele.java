package arrays;

import java.util.HashMap;

public class Non_repeating_ele {
    public static void main(String[] ar)
    {
        int[] arr ={2,4,5,7,5,2,4,6,8,9,0};

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int num :arr)
        {
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        for(int num : arr){
        if(mp.get(num)==1)
            System.out.print(num+" ");}

    }

}
