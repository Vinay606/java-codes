package Patterns;

import java.util.Scanner;

public class Half_diamond {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //for increasing half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

        //for decreasing half
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
