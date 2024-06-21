package Patterns;

import java.util.Scanner;

public class Rhombus_star {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();

        for(int i=1;i<=row;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 0; j <= col; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
