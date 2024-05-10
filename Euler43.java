package problems;

import java.math.BigInteger;

public class Euler43
{
    public static boolean isPandigital (String s)
    {
        if (s.length() != 10)
        {
            return false;
        }
        for (char c = '0'; c <= '9'; c++)
        {
            if (s.indexOf(c) == -1)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        long sum = 0;
        for (long i = 1023456789L; i<= 9876543210L; i++)
        {
                String temp = String.valueOf(i);
                if (isPandigital(String.valueOf(i)) &&
                        Integer.parseInt(temp.substring(1, 4)) % 2 == 0 &&
                        Integer.parseInt(temp.substring(2, 5)) % 3 == 0 &&
                        Integer.parseInt(temp.substring(3, 6)) % 5 == 0 &&
                        Integer.parseInt(temp.substring(4, 7)) % 7 == 0 &&
                        Integer.parseInt(temp.substring(5, 8)) % 11 == 0 &&
                        Integer.parseInt(temp.substring(6, 9)) % 13 == 0 &&
                        Integer.parseInt(temp.substring(7, 10)) % 17 == 0)
                {
                    sum += i;
                    System.out.println(i);
                }
        }
        System.out.println("Sum: " + sum);
    }
}
