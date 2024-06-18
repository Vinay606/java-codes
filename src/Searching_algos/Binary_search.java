package Searching_algos;

public class Binary_search {

    public static int search(int array[], int tar) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (array[mid] == tar) {
                return mid;
            }
            if (array[mid] > tar) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;

    }


    public static void main(String[] arr)
    {
        int[] sorted_arr = {1,2,3,4,8,9};
        int tar = 3;
        int res = search(sorted_arr, tar);

        if(res==-1)
        {
            System.out.println("not found");

        }
        else {
            System.out.println("found at "+ res +" position");
        }

    }
}
