package problems;

import java.util.TreeMap;

import static problems.MyFunctions.gcd;

public class Euler73
{
    public static void main(String[] args)
    {
        int limit = 12000;
        int count = 0;
        for (int d = 2; d <= limit; d++)
        {
            int nStart = d / 3 + 1; // Start from the smallest n that could produce a valid fraction

            for (int n = nStart; 2 * n < d; n++)
            {
                if (gcd(n, d) == 1) // Check for coprime
                {
                    count++;
                }
            }
            if (d % 120 == 0)
            {
                System.out.println(d);
            }
        }

        System.out.println(count);
    }
}
