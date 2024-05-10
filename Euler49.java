package problems;

import java.util.*;

public class Euler49
{
    public static boolean isPrime(long n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (long i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean arePermutations(int num1, int num2, int num3) {
        char[] charArray1 = Integer.toString(num1).toCharArray();
        char[] charArray2 = Integer.toString(num2).toCharArray();
        char[] charArray3 = Integer.toString(num3).toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Arrays.sort(charArray3);

        return Arrays.equals(charArray1, charArray2) && Arrays.equals(charArray2, charArray3);
    }
    public static void main(String[] args)
    {
        for (int i = 1000; i <= 9999; i++)
        {
            int num1 = i;
            int num2 = i + 3330;
            int num3 = i + 6660;

            if (isPrime(num1) && isPrime(num2) && isPrime(num3) && arePermutations(num1, num2, num3) )
            {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }
        }
    }
}
