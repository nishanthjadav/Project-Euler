package problems;

import java.math.BigInteger;

import static problems.MyFunctions.*;

public class Euler216
{

    public static boolean isPrime(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        return n.isProbablePrime(10);
    }

    public static void main(String[] args)
    {
        int count = 0;
        long limit = 50_000_000;
        for (long i = 2; i <= limit; i++)
        {
            if (i % 50_000 == 0)
            {
                System.out.println(i);
            }
            BigInteger temp = new BigInteger("2");
            temp = temp.multiply(BigInteger.valueOf(i * i)).subtract(BigInteger.valueOf(1));
            if (isPrime(temp))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
