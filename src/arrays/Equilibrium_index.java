package arrays;

public class Equilibrium_index {
    public static void main(String[] ar)
    {
        int[] arr = {1,2,3,-4,5,1,7};

        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            //left sum
            int left_sum = 0;
            for(int j=0; j<i;j++)
                left_sum += arr[j];

            // right sum
            int right_sum = 0;
            for(int k=i+1;k<n;k++)
                right_sum += arr[k];

            // compare 
            if(left_sum == right_sum)
                System.out.println("Equilibrium index: "+i);
            else
                System.out.println("No equilibrium index");
        }
    }
}
