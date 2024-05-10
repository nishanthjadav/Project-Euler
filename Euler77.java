package problems;
import static problems.MyFunctions.*;

public class Euler77
{
    public static void main(String[] args)
    {
        int n = 71; // guess and check

        long[] ways = new long[n + 1];
        ways[0] = 1;

        for (int i = 1; i < n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                if (isPrime(i))
                {
                    ways[j] +=  ways[j - i];
                }
            }
        }
        long result = ways[n];
        System.out.println(result);
    }
}
