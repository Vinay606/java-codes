package Strings;

import java.util.Scanner;

public class String_plaindrome {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        String rev = new String();
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            rev = ch + rev;
        }
        if(word.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");


        /* optimised approach

        result = isPalindrome(word);
        if (result)
            sout("Palindrome");
        else
            sout("Not a paindrome");

        isPalindrome(String word)
        {
            int left =0;
            int right = word.length-1;

            while(left<right)
            {
            if(word.charAt(left) != word.charAt(right))
                return false;
            left ++;
            right --;

            }
            return true;
        }
         */

    }
}
