package problems;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static problems.MyFunctions.*;

public class Euler134
{
    public static long getN(long p1, long p2)
    {
        String pOne = String.valueOf(p1);
        for (long i = 1; ; i++)
        {
            String temp = String.valueOf(i).concat(pOne);
            long n = Long.parseLong(temp);
            if (n % p2 == 0)
            {
                return n;
            }
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Long> primes = new ArrayList<>();
        for (long i = 5; i <= 1_000_010; i+=2)
        {
            if (isPrime(i))
            {
                primes.add(i);
            }
        }
        long sum = 0;
        for (long p : primes)
        {
            try {
                int index1 = primes.indexOf(p);
                Long p2 = primes.get(index1 + 1);
                sum += getN(p, p2);
            } catch (Exception ignored){}
        }
        System.out.println(sum);

    }
}
