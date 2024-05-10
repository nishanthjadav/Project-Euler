package problems;

import java.util.HashSet;
import java.util.TreeSet;

public class Euler35
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

    public static boolean areAllRotationsPrime(int num)
    {
        String numStr = Integer.toString(num);
        int numRotations = numStr.length();

        for (int j = 0; j < numRotations; j++)
        {
            if (!isPrime(Integer.parseInt(numStr)))
            {
                return false;
            }
            numStr = numStr.substring(1) + numStr.charAt(0); // rotate digits
        }

        return true;
    }

    public static void main(String[] args)
    {
        TreeSet<Integer> rotatedNumSet = new  TreeSet<>();
        for (int i = 1; i < 1000000; i++)
        {
            if (isPrime(i) && areAllRotationsPrime(i))
            {
                rotatedNumSet.add(i);
            }
        }
        System.out.println(rotatedNumSet);
        System.out.println(rotatedNumSet.size());
    }
}