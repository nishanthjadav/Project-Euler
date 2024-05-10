package problems;

import java.math.BigInteger;

public class Euler55
{
    static boolean isPalindrome(BigInteger num)
    {
        BigInteger temp = num;
        BigInteger reverse = BigInteger.ZERO;

        while (!temp.equals(BigInteger.ZERO))
        {
            BigInteger rem = temp.mod(BigInteger.TEN);
            reverse = reverse.multiply(BigInteger.TEN).add(rem);
            temp = temp.divide(BigInteger.TEN);
        }

        return num.equals(reverse);
    }

    public static BigInteger reversedNum(BigInteger num)
    {
        BigInteger temp = num;
        BigInteger reverse = BigInteger.ZERO;

        while (!temp.equals(BigInteger.ZERO))
        {
            BigInteger rem = temp.mod(BigInteger.TEN);
            reverse = reverse.multiply(BigInteger.TEN).add(rem);
            temp = temp.divide(BigInteger.TEN);
        }

        return reverse;
    }

    public static int lychrelCalc(BigInteger n, int count)
    {
        BigInteger temp = n.add(reversedNum(n));
        if (count > 50)
        {
            return count;
        }
        if (isPalindrome(temp))
        {
            return count;
        }
        else
        {
            return lychrelCalc(temp, count + 1);
        }
    }

    public static void main(String[] args)
    {
        int lyrchrelNumCount = 0;
        for (int i = 1; i < 10000; i++)
        {
            int count = lychrelCalc(BigInteger.valueOf(i), 1);
            if (count > 50)
            {
                lyrchrelNumCount++;
            }
        }
        System.out.println("num of lychrel nums below 10k: " + lyrchrelNumCount);
    }
}
