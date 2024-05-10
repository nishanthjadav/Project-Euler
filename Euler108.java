package problems;

public class Euler108
{
    // Modified Pell's equation
    public static void main(String[] args)
    {
        long n = 2;

        while (true)
        {
            long count = countDistinctSolutions(n);
            if (n % 10_000 == 0)
            {
                System.out.println(n  + ": " + count);
            }
            if (count > 1000)
            {
                System.out.println("The least value of n: " + n);
                break;
            }

            n++;
        }
    }

    public static long countDistinctSolutions(long n)
    {
        long count = 0;

        for (long x = n + 1; x <= 2 * n; x++)
        {
            if ((n * x) % (x - n) == 0)
            {
                count++;
            }
        }

        return count;
    }
}
