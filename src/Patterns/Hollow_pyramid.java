package Patterns;

import java.util.Scanner;

public class Hollow_pyramid {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
            {
                if( (i==1 || j==1) || (i==n|| j == 2*i-1  ))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
