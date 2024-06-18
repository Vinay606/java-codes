package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ele_sum {
    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // reading array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int sum = 0;

        //Adding array elements
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
