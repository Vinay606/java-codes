package arrays;

public class max_subarray_product {
    public static void main(String[] ar)
    {
        int[] arr = {4,8,-9,0,8,9,0,10,10};
        int n = arr.length;

        int prod =1;
        int res= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(prod==0) prod =1;
            prod = prod * arr[i];
            res =Math.max(res,prod);
        }
        System.out.println(res);


        //        int pre=1;
//        int suf=1;
//        int result = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++)
//        {
//            if(suf==0) suf=1;
//            if(pre==0) pre=1;
//            pre = pre * arr[i];
//            suf = suf * arr[n-i-1];
//            result = Math.max(result, Math.max(pre, suf));
//        }
//        System.out.println(result);
//

    }

}
