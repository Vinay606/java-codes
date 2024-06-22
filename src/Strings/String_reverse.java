package Strings;

import java.util.Scanner;

public class String_reverse {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch ;
        String rev_str = "" ;

        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            rev_str = ch + rev_str;
        }
        System.out.println(rev_str);


        //using string builder
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        //using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}
