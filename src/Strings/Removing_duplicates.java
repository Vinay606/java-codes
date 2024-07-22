package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Removing_duplicates {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        String str = "Vinay Kumar";
        String result = remove_dup(str);
        System.out.println("Non-repeating characters are: "+result);

    }

    private static String remove_dup(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char temp = str.charAt(i);
            map.put(temp,map.getOrDefault(temp,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char temp = str.charAt(i);
            if(map.get(temp)>1)
                sb.append(temp);
            else
                continue;
        }
     return sb.toString();
    }
}
