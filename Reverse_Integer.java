// Intuition
// After reading the problem, I find that we need to check two things:

// Whether the number is positive or negative.
// Whether the reversed number is greater than INTEGER range.
// Approach
// We will work on the "Ones place" of number i.e. the last digit.
// Suppose the number is 321, we need to follow the following steps:

// Make a long integer num initialized with 0. (long num = 0).
// Store the ones place of "321" in variable r. (int r = num%10).
// Multiply num by 10. (num *= 10).
// Add the remainder r to num. (num += r).
// Divide "321" by 10. Then it will become "32". (x /= 10).
// Continue the above steps untill x becomes 0.
// Complexity
// Time complexity: O(n) (Where n is the total no. of digits)
// Space complexity: O(1)


public class Reverse_Integer
{
    public static void main(String[] args) {

        System.out.println(reverse(1534236469));

        
    }


    static int reverse(int x) {

        boolean flag = true;
        if(x < 0) flag = false; // if x is -ve then flag is false;

        x = Math.abs(x);

        long num = 0;
        int r;

        while(x > 0)
        {
            num *= 10;      
            r = x % 10;         // r = remainder;
            num += r;           // remainder is added;
            x /= 10;            // x is divided by 10;
        }
        if(num > Integer.MAX_VALUE)     // if reversed is greater then 0 is returned;
        return 0;

        int result = (int)num;

        if(!flag)           // if the no. is -ve. Subtract it two times;
        {
            result -= num;
            result -= num;            
        }

        return result;
        
    }
    
}
