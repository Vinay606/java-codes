package Patterns;

public class Traingle_star {
    public static void main(String[] ar)
    {
        for(int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
