package arrays;

public class maxElement {
    public static void main(String[] ar)
    {
    int[] arr = {10,1,5,7,65,8,3,2};
    int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
