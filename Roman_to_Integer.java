public class Roman_to_Integer {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));


    }
    static int romanToInt(String s) {

//        There are six instances where subtraction is used:
//
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//        Given a roman numeral, convert it to an integer.


        int n = s.length();         // storing the size of s in variable n;

        int num = 0;                // we will store the number in num.

        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);   // storing character in ch;
            switch (ch)
            {
                case 'I':
                    if(i == n-1)      // if it is the last char
                    {
                        num += 1;
                    }
                    else
                    {
                        if(s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V')        // if the successor is bigger then value will be substracted
                        {
                            num -= 1;
                        }
                        else                                                    // else the value will be added
                        {
                            num += 1;
                        }
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if(i == n-1)
                    {
                        num += 10;
                    }
                    else
                    {
                        if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')
                        {
                            num -= 10;
                        }
                        else
                        {
                            num += 10;
                        }
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i == n-1)
                    {
                        num += 100;
                    }
                    else
                    {
                        if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')
                        {
                            num -= 100;
                        }
                        else
                        {
                            num += 100;
                        }
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;

    }
}