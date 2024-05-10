package problems;
import java.util.ArrayList;

import static problems.MyFunctions.*;

public class Euler123
{
    public static long remainder (long p, long n)
    {
        long term1 = ((p - 1) * n) % (p * p); // the modulo resulting from multiplying by n is the same as if you were to raise it to the nth power.
        long term2 = ((p + 1) * n) % (p * p);
        return (term1 + term2) % (p * p);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 1000000; i++)
        {
            if (isPrime(i))
            {
                primes.add(i);
            }
        }
        int n = 10000;
        while (true)
        {
            long remainder = remainder(primes.get(n - 1), n);
            System.out.println(remainder);
            n++;
            if(remainder > 10000000000L)
            {
                System.out.println(n);
                break;
            }
        }
    }
}
