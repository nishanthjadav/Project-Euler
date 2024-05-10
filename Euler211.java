package problems;

import static problems.MyFunctions.*;

public class Euler211
{
    public static long sumOfSquaresOfDivisors(long n)
    {
        if (n <= 1)
        {
            return 1;
        }

        long sum = 1 + n * n; // add 1 and then the square of n itself

        for (long i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                if (i * i == n)
                {
                    sum += i * i; //  perfect squares
                } else {
                    sum += i * i + (n / i) * (n / i); // Add both divisors
                    // Ex: n = 12
                    // sum = 1 + (12 * 12) = 145
                    // sum += (2 * 2) + (12 / 2) * (12 / 2): currSum = 40 + 145 = 185
                    //      curr i ^2 + "reciprocal factor"^2
                    //           2 ^2 +  6^2
                    // sum += (3 * 3) + (12 / 3) * (12 / 3): curr sum = 185 + 25 = 210
                    //      curr i ^2 + "reciprocal factor"^2
                    //           3 ^2 +  4^2
                    // 12: 1^2 + 2^2 + 3^2 + 4^2 + 6^2 + 12^2 = 210
                }
            }
        }
        return sum;
    }
    public static boolean isPerfectSquare(long n)
    {
        double sqrt = Math.sqrt(n);
        return sqrt - Math.floor(sqrt) == 0;
    }
    public static void main(String[] args)
    {
        long sum = 0;
        for (int i = 1; i < 64_000_000; i++)
        {
            if (i % 640_000 == 0)
            {
                System.out.println(i);
            }
            if (isPerfectSquare(sumOfSquaresOfDivisors(i)))
            {
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
