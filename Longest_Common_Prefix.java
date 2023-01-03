
public class Longest_Common_Prefix {
    public static void main(String[] args) {

        String [] str = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));

    }
    static String longestCommonPrefix(String[] strs) {

        int size = strs.length; // finding the size of array

        int n = strs[0].length(); // length of 1st string

        int i, j;

        for(i = 0; i < n; i++)                  // i operate from 0 to last index of first string.
        {
            boolean flag = false;               // flag variable tell us when the loop break.
            char ch = strs[0].charAt(i);        // ch contains ith character of first string.

            for(j = 1; j < size; j++)           // j represents index of array strs.
            {
                if(i >= strs[j].length() || strs[j].charAt(i)!=ch)
                // if the index exceeds the string size of ith character are different then
                    // loop breaks.
                {
                    flag = true;
                    break;
                }

            }
            if(flag) break;
        }

        return strs[0].substring(0, i);
    }
}
