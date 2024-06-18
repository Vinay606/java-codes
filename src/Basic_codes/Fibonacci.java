package Basic_codes;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int a =0;
        int b=1;
        int n= s.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(n-2>0)
        {
            int c= a + b;
            System.out.println(c);
            a=b;
            b=c;
            n--;
        }

    }
}
