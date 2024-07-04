package Number_conversions;

import java.util.Scanner;

public class Decimal_toBinary {
    public static void main(String[] ar)
    {
        Scanner s = new Scanner(System.in);
        int decimal = s.nextInt();
        StringBuilder binary = new StringBuilder();
        while(decimal>0)
        {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        System.out.println(binary.toString());
    }
}

/* Using built-in conversion
Integer.toBinaryString(number); */