package problems;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static problems.MyFunctions.*;

public class Euler348
{
    public static boolean fourWays(long n)
    {
        int count = 0;
        HashMap<Long, Long> sums = new HashMap<>();
        for (long i = 1; i <= Math.sqrt(n); i++)
        {
            for (long j = 1; j <= Math.cbrt(n); j++)
            {
                long tempCalc = ( i * i) + (j * j * j);
                if (tempCalc == n)
                {
                    sums.put(i, j);
                    count++;
                }
            }
        }
        if (count == 4)
        {
            for (Map.Entry<Long, Long> entry : sums.entrySet())
            {
                System.out.print(entry.getKey() + "^2" +  " + " + entry.getValue() + "^3" + " --- ");
            }
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        int count = 0;
        long i = 0;
        long sum = 0;
        while (count <= 4)
        {
            if (isPalindrome(i) && fourWays(i))
            {
                System.out.println(i);
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

    }

}
