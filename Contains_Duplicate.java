
import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {

        int [] nums = {1,2,3,1};
    }
    static boolean containsDuplicate(int[] nums) {





        //We can use a hash set to optimize the code.
        HashSet<Integer> set = new HashSet<>();


        //Use for each loop to access the elements.
        for(int element: nums)
        {
            //If set already contains the element then return true.
            if(set.contains(element))
                return true;

            //add the element to the set.
            set.add(element);
        }

        // return false if all the elements are unique.
        return false;


    }
}
