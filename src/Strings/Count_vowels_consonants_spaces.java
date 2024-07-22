package Strings;

import java.util.Scanner;

public class Count_vowels_consonants_spaces {
    public static void main(String ar[]){
    Scanner s = new Scanner(System.in);
    String word = s.nextLine();
    int n = word.length();
    int vowels = 0;
    int consonants = 0;
    int spaces = 0;

    for(int i=0;i<n;i++)
    {
     char ch = word.charAt(i);
     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
         vowels ++;
     else if (ch >= 'a' && ch <='z')
         consonants++;
     else
         spaces++;
    }
        System.out.println("vowels "+vowels+" consonants " + consonants + " spaces " + spaces);



    }
}
