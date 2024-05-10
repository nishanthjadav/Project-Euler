package problems;

import static problems.MyFunctions.*;

public class Euler127
{
    public static long gcd(long a, long b)
    {
        while (b != 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long rad(long n)
    {
        long product = 1;

        for (long i = 2; i * i <= n; i++)
        {
            if (isPrime(i) && n % i == 0)
            {
                product *= i;
                while (n % i == 0)
                {
                    n /= i;
                }
            }
        }
        if (n > 1)
        {
            product *= n;
        }
        return product;
    }

    public static boolean isABC_hit(long a, long b, long c, long[] radicals) {
        long radABC = radicals[(int) a] * radicals[(int) b] * radicals[(int) c];
        return gcd(radicals[(int) a], radicals[(int) b]) == 1 &&
                gcd(radicals[(int) a], radicals[(int) c]) == 1 &&
                gcd(radicals[(int) b], radicals[(int) c]) == 1 &&
                radABC < c;
    }

    public static void main(String[] args)
    {
        long sum = 0;
        long limit = 120_000;

        // Precompute radicals
        long[] radicals = new long[(int) limit];
        for (int i = 1; i < limit; i++)
        {
            radicals[i] = rad(i);
        }

        //int count = 1;
        for (long a = 1; a < limit / 2; a++) // a is always gonna be small
        {
            if (a % 1000 == 0)
            {
                System.out.println(a);
            }
            int incrementB = 1;
            if (a % 2 == 0) //  a and b are always opposite signs
            {
                incrementB = 2;
            }

            for (long b = a + 1; a + b < limit; b += incrementB)
            {
                long c = a + b;
                if (isABC_hit(a, b, c, radicals))
                {
                   // System.out.println("#" + count + ": (" + a + ", " + b + ", " + c + ")");
                    sum += c;
                    //count++;
                }
            }
        }
        System.out.println(sum);
    }
}