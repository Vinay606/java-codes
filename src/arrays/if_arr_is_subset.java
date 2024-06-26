package arrays;

public class if_arr_is_subset {
    public static void main(String[] ar)
    {
        int[] arr = {7,8,9,4,57,2,1,6,5,6,8,6,4};
        int[] subset_arr = {4,5,987};
        boolean present =false;

        for(int i=0;i<subset_arr.length;i++)
        {
            present = false;
            for(int j=0;j<arr.length;j++)
            {
                if(subset_arr[i]==arr[j])
                {
                    present=true;
                    break;
                }
            }
        }
        if(present)
            System.out.println("It is subarray");
        else
            System.out.println("It is not subarray");
    }
}
