package problems;

import java.math.BigInteger;
import java.util.HashSet;

public class Euler63
{
    public static boolean isPowerfulDigit(int base, int power)
    {
        BigInteger result = BigInteger.valueOf(base).pow(power);
        int length = String.valueOf(result).length();

       return length == power;
    }
    public static void main(String[] args)
    {


        int count = 1;
        for (int power = 1; power < 40; power++)
        {
            for (int base = 1; base < 25; base++)
            {
                if (isPowerfulDigit(base, power))
                {

                    BigInteger result = BigInteger.valueOf(base).pow(power);
                    System.out.println("#" + count + " " + result);
                    count++;

                }
            }
        }

    }
}
