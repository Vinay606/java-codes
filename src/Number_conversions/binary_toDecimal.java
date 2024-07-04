package Number_conversions;

import java.util.Scanner;

public class binary_toDecimal {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        String binary = s.nextLine();
        int n = binary.length();
        int dec=0;
        for(int i=0;i<n;i++)
        {
            char ch = binary.charAt(n-i-1);
            if(ch =='1')
                dec += Math.pow(2,i);
        }
        System.out.println(dec);
    }
}
