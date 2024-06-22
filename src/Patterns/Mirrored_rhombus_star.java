package Patterns;

import java.util.Scanner;

public class Mirrored_rhombus_star {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int row =s.nextInt();
        int col = s.nextInt();

        for(int i=row;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
                System.out.print(" ");
            for(int j=col;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }

    }
}
