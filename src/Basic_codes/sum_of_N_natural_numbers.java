package Basic_codes;

import java.util.Scanner;

public class sum_of_N_natural_numbers {
    public static void main(String[] ar)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n");
        n = s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
