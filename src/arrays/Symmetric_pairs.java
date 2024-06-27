package arrays;

public class Symmetric_pairs {
    public static void main(String[] ar)
    {
        int arr[][] ={ {1,2},{2,1},{6,4},{7,8},{8,7},{5,5}};
        System.out.println("Symmetric pairs are : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0])
                    System.out.println("(" + arr[i][0] + ","+arr[j][0] + ")") ;
            }
        }
    }

}
