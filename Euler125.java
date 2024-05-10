package problems;
import java.util.HashSet;

import static problems.MyFunctions.*;

public class Euler125
{
    public static boolean doubleChecker(long n, int base)
    {
        long sum = 0;
        for (long i = base; i >= 1; i--)
        {
            sum += (i * i);
            if (sum == n)
            {
                return true;
            }
        }
        return false;
    }
    private static long palindromicSum(int limit)
    {
        long sum = 0;
        HashSet<Long> used = new HashSet<>();

         for (int start = 1; start <= limit; start++)
        {
            long currentSum = 0;
            for (int end = start; end <= limit; end++)
            {
                currentSum += (long) end * end;
                if (currentSum > limit)
                {
                    break;
                }
                if (end > start && isPalindrome((int) currentSum) && doubleChecker(currentSum, end))
                {
                    System.out.println(end + "^2" + " to " + start + "^2" + " = " + currentSum);
                    if (!used.contains(currentSum))
                    {
                        sum += currentSum;
                        used.add(currentSum);
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int limit = 100000000;
        long result = palindromicSum(limit);
        System.out.println("The sum of palindromic numbers less than " + limit + " is: " + result);
    }
}
