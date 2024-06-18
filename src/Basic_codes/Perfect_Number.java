package Basic_codes;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
            sum = sum +i;
            }
        }

        if(sum ==number)
        {
            System.out.println("perfect number");
        }
        else {
            System.out.println("Not a perfect number");
        }

    }
}
