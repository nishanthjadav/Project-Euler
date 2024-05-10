package problems;

import java.util.Arrays;

public class Euler76
{
    public static void main(String[] args)
    {
        int n = 100;

        long[] ways = new long[n + 1];
        ways[0] = 1;

        for (int i = 1; i < n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                ways[j] +=  ways[j - i];
            }
        }
        long result = ways[n];
        System.out.println(result);

    }
}
