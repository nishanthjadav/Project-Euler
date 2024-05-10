package problems;
import java.util.ArrayList;

import static problems.MyFunctions.*;

public class Euler214
{
    public static int totientChain(int n)
    {
        int chainLength = 1;
        while (n != 1)
        {
            n = totient(n);
            chainLength++;
        }
        return chainLength;
    }
    public static boolean totientChainOf25(int n)
    {
        int chainLength = 1;
        while (n != 1)
        {
            n = totient(n);
            chainLength++;
            if (chainLength > 25)
            {
                return false;
            }
        }
        return chainLength == 25;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 3; i < 40_000_000; i+=2)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }
        }
        System.out.println("done generating primes");
        long sum = 0;
        for (int i : primes)
        {
            if (totientChainOf25(i))
            {
                sum += i;
            }

        }
        System.out.println(sum);

    }
}
