package Basic_codes;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] ar)
    {
        int year;
        Scanner s = new Scanner(System.in);
        year = s.nextInt();

        //if year is century year divide by 400 --> leap year
        if((year % 400)==0)
        {
            System.out.println("Leap Year");
        }
        //if not century year it should be divisible by 4 but not 100 coz it's not century yr
        else if((year % 4 ==0) && (year % 100!=0))
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }

}
