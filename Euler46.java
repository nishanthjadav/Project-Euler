package problems;

public class Euler46
{
    public static boolean isPrime(long n)
    {
        if (n <= 1)
        {
            return false;
        }

        for ( long i = 2; i * i <= n; i++)
        {

            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n = 9;
        while (true)
        {
            if (!isPrime(n))
            {
                boolean found = false;
                for (int j = 1; j * j * 2 <= n; j++)
                {
                    int primeCandidate = n - 2 * j * j;
                    if (isPrime(primeCandidate))
                    {
                        found = true;
                        break;
                    }
                }
                if (!found)
                {
                    System.out.println(n);
                    break;
                }
            }
            n += 2;
        }
    }
}
