package problems;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler225
{
    public static void main(String[] args)
    {
        BigInteger term1 = BigInteger.valueOf(1);
        BigInteger term2 = BigInteger.valueOf(1);
        BigInteger term3 = BigInteger.valueOf(1);
        BigInteger next;
        ArrayList<BigInteger> tribonacci = new ArrayList<>();
        for (int i = 0; i < 100000; i++)
        {
            //System.out.println(term1);
            tribonacci.add(term1);
            next = term3.add(term2).add(term1);
            term1 = term2;
            term2 = term3;
            term3 = next;
        }

        ArrayList<Long> oddNums = new ArrayList<>();
        for (long i = 1; i < 100000; i+=2)
        {
            oddNums.add(i);
        }

        int count = 1;
        for (long i : oddNums)
        {
            boolean divisible = false;
            for (BigInteger x : tribonacci)
            {
                if (x.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO))
                {
                    divisible = true;
                    break;
                }
            }
            if (!divisible)
            {
                System.out.println(count + ": " + i);
                count++;
                if (count > 125)
                {
                    break;
                }
            }
        }

    }
}
