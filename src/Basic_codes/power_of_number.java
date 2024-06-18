package Basic_codes;

import java.util.Scanner;

public class power_of_number {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int raise = s.nextInt();
        int power = (int) Math.pow(num,raise);
        System.out.println(power);
    }
}
