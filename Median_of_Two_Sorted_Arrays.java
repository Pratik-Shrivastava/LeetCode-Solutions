public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {

        int [] nums1 = {1,3};
        int [] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;          // find the length of both arrays.
        int n2 = nums2.length;

        int n = n1+n2;                  // length of new array.

        int [] res = new int[n];    // create a new array to store all the elements.

        int i = 0;                      // i will point to num1.
        int j = 0;                      // j will point to num2.
        int k = 0;                      // k will point to res.

        while(i < n1 && j < n2)       // while num1 and num2 has elements.
        {
            if(nums1[i] <= nums2[j])      // compare and put it in new array.
            {
                res[k] = nums1[i++];
            }
            else
            {
                res[k] = nums2[j++];
            }
            k++;
        }
        while(i < n1)
        {
            res[k++] = nums1[i++];
        }
        while(j < n2)
        {
            res[k++] = nums2[j++];
        }
        //System.out.println(Arrays.toString(res));


        double median;         // declaring median;
        n--;                    // n represents the last index.
        if(n % 2 != 0)          // if the total elements are odd.
        {
            median = (double) (res[n/2] + res[(n/2) + 1])/2;
        }
        else                    // if the total elements are even
        {
            median = res[n/2];
        }
        return median;

    }
}