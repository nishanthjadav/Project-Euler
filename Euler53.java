package problems;

import java.math.BigInteger;

public class Euler53
{
    public static BigInteger factorial(long n)
    {
        BigInteger product = new BigInteger("1");
        for (int i = 1; i <= n; i++)
        {
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
    public static BigInteger nChooseK (long n, long k)
    {
        return (factorial(n).divide(factorial(k).multiply(factorial(n - k)))); // n choose k formula
    }

    public static void main(String[] args)
    {
        int count = 0;
            for (long n = 1; n <= 100; n++)
            {
                for (long k = 1; k <= n; k++)
                {
                    if (nChooseK(n, k).compareTo(BigInteger.valueOf(1000000)) > 0)
                    {
                        count++;
                    }
                }
            }


        System.out.println("Number of n choose k values (between 1, 100) greater than 1 mil: " + count);
    }
}
