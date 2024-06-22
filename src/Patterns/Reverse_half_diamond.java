package Patterns;

import java.util.Scanner;
public class Reverse_half_diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        // for top half
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //for below half
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}