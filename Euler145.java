package problems;
import java.util.HashSet;

import static problems.MyFunctions.*;

public class Euler145
{

    public static boolean hasAllOddDigits(int n)
    {
        while (n >= 1)
        {
            int digit = n % 10;
            n /= 10;
            if (digit % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        HashSet<Integer> reversible = new HashSet<>();
        int limit = 1000000000;
        for (int i = 1; i < limit; i++)
        {
            if (i % 10000000 == 0)
            {
                System.out.println(i);
            }
            if (String.valueOf(i).length() != String.valueOf(reversedNum(i)).length())
            {
                continue;
            }
            int sum = i + reversedNum(i);
            if (hasAllOddDigits(sum))
            {
                reversible.add(i);
                //System.out.println("i: " + i + ", reverse i: " + reversedNum(i) + ", sum: " + sum);
            }

        }
        System.out.println(reversible.size());

    }
}
