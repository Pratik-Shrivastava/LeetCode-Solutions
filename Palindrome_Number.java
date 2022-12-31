public class Palindrome_Number {
    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));

    }
    static boolean isPalindrome(int x) {

// First we have to understand what is meant by a "PALINDROME" number.
// Suppose we have a number 'x'. If we REVERSE x and store it in 'y' then x and y should be EQUAL.

// Mathematically, x is palindrome iff x = y where y = reverse of x.

// Example 1:
// let x = 123,
// then y = reverse of x = 321;
// Since, 123 != 321, Hence, x is not palindrome.

// Example 2:
// let x = 1221,
// then y = reverse of x = 1221;
// Since 1221 == 1221, Hence, x is palindrome.

        // Two-Pointer Approach


        // Step1: Convert the integer into string.
        // Step2: Point two variable at first and last indices of the string.
        // Step3: Compare the characters at those indices.
        // Step4: Update the variables.

        String s = String.valueOf(x);  // convert integer to string.

        int i = 0;                     // i will initially point to first index.
        int j = s.length() - 1;        // j will initially point to last index.

        // i and j are opposite indices of the string.
        // 1. If 'i' is first then 'j' is last.
        // 2. Similarly, if 'i' is second then 'j' is second last index of s.
        // This is because they are updated simultaneously.

        while(i <= j)                   // loop will break when i and j cross each other
        {
            if(s.charAt(i) != s.charAt(j))  // characters at indices i and j will be compared.
                // If the characters are unequal then false will be returned.
                return false;
            i++;                                // i is incremented.
            j--;                                // j is decremented.
        }

        // If loop ends without returning false, it means that every 'ith' character
        // is equal to every 'jth' character. Thus, the number is palindrome.
        // Hence, return true;

        return true;



    }
}