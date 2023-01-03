import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {

        int [] nums = {};
        System.out.println(removeElement(nums, 2));

    }
    static int removeElement(int[] nums, int val) {

//         We will use two pointer approach.
//         One will point to 1st.
//         Other will point to last.
//         If start pointer points to target, then replace it with end pointer value.


//        We will check a base condition that if the array is empty so return 0;

        if(nums.length == 0) return 0;

        int i = 0;
        int j = nums.length-1;







        while(i < j)            // loop will break when i and j crosses each other.
        {
            if(nums[i] == val)
            // if ith element points to target.
            {
                // it will be replaced with jth element.
                nums[i] = nums[j];

                // we will then decrement j.
                j--;

                // We will NOT increment i because we never know that the
                // replaced element is not the target.
                // if jth element is also target, then we will repeat the steps.
            }
            else
            {
                // We will approach the next index.
                i++;
            }
        }

        // Now we need to check one base condition.

        // If the element at ith index is target then return i;
        if(nums[i] == val) return i;


        // Finally, We have to return position so will add 1 to index value i.
        return i+1;




    }
}
