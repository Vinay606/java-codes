package Basic_codes;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] ar)
    {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if(num==0 || num ==1)
        {
            System.out.println("Neither prime nor composite");
        }
        else {
            //iterate till num/2 coz after half the number itself is only the factor ex: 5 -> 1,5 8 -> 2,4,8
            int ctr = 0;
            for (int i = 2; i <= num / 2; i++) {
                if (num % 2 == 0) {
                    ctr++;
                }

            }

            if (ctr == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime");
            }
        }

    }

}
