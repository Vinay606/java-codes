package Basic_codes;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);


    }
}
