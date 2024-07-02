package arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Rotate_array_by_K_elements {
    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k = s.nextInt();
        System.out.println("Enter position");
        String pos = s.next();
        int[] temp = new int[n];
        k = k%10;


        System.out.println(Arrays.toString(arr));

        if(Objects.equals(pos, "right") || Objects.equals(pos, "Right")) {
            //for k elements
            for (int i = 0; i < k; i++) {
                temp[i] = arr[n - k + i];
            }

            //for remaining elements
            for (int i = k; i < n; i++) {
                temp[i] = arr[i - k];
            }
            System.out.println(Arrays.toString(temp));
        }

        else {
            //for last n-k elements
            for (int i = 0; i < n - k; i++) {
                temp[i] = arr[k + i];
            }

            //for remaining elements
            for (int i = n - k,j=0; i < n; i++,j++) {
                temp[i] = arr[j];
            }
            System.out.println(Arrays.toString(temp));
        }



    }

}
