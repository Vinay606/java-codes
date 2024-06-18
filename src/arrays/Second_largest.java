package arrays;

public class Second_largest
{

    public static void main(String [] ar)
    {
        int arr[] = {7,8,9,5,4,2,1};

        int max = arr[0];
        int sec_max = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                sec_max=max;
                max=arr[i];

            }
        }
        System.out.println(sec_max);
    }
}
