package Basic_codes;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.*;

public class reverse_number {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int new_num = 0;
        int temp = number;

        //extract each digit and add to new num at end
        while(number>0)
        {
            int last_digit = number % 10;
            new_num = (new_num *10) + last_digit;
            number/=10;
        }
        System.out.println(new_num);

        if(new_num == temp)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a plaindrome");
        }

    }
}
