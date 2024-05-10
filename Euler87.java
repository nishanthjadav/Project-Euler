package problems;
import java.util.ArrayList;
import java.util.HashSet;

import static problems.MyFunctions.*;

public class Euler87
{
    public static void main(String[] args)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < 10000; i++)
        {
            if (isPrime(i))
            {
                primes.add(i);
            }
        }
        HashSet<Long> primePowerTriples = new HashSet<>();
        for (int i : primes)
        {
            for (int j : primes)
            {
                for (int k : primes)
                {
                    long product = (long) (Math.pow(i, 2) + Math.pow(j, 3) + Math.pow(k, 4));
                    if (product < 50000000)
                    {
                        System.out.println(product + " = " + i + " + " + j + " + " + k);
                        primePowerTriples.add(product);
                    }
                }
            }
        }
        System.out.println(primePowerTriples.size());
    }
}
