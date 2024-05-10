package problems;

import java.math.BigInteger;

public class Euler56
{
    public static void main(String[] args)
    {
        BigInteger product = new BigInteger("0");
        int largestSum = 0;
        for (int a = 1; a < 100; a++)
        {
            for (int b = 1; b < 100; b++)
            {
                BigInteger bigA = BigInteger.valueOf(a);
                product = bigA.pow(b);
                BigInteger tempNumber = product;
                int sum = 0;
                while (!tempNumber.equals(BigInteger.ZERO))
                {
                    BigInteger[] quotientAndRemainder = tempNumber.divideAndRemainder(BigInteger.TEN);
                    int digit = quotientAndRemainder[1].intValue();
                    sum += digit;
                    tempNumber = quotientAndRemainder[0];
                }
                if (sum > largestSum)
                {
                    largestSum = sum;
                }

            }
        }
        System.out.println("largest sum: " + largestSum);

    }
}
