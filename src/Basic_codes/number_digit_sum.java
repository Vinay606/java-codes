package Basic_codes;

import java.util.Scanner;

public class number_digit_sum {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum = 0;

        //extract each digit and add it to sum
        while(number>0)
        {
            sum = sum + (number % 10);
            number = number/10;
        }
        System.out.println(sum);

    }
}
