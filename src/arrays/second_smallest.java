package arrays;

public class second_smallest {
    public static void main(String[] ar)
    {
    int[] arr ={1,2,3,5,8,0,3,4};
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                second_min = min;
                min = num;
            } else if (num < second_min && num != min) {
                second_min = num;
            }
        }

        System.out.println(second_min);
    }
}
