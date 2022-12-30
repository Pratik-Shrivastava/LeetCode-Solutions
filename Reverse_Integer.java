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
