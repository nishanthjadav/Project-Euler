package problems;
import java.util.ArrayList;

import static problems.MyFunctions.*;
public class Euler274
{
    public static long gcd(long a, long b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static boolean isCoPrimeWith10(long p)
    {
        return gcd(p, 10) == 1;
    }
    public static long divMultiplier(long p)
    {
        long n = 1234 * p;

        String s = String.valueOf(n);

        String allButLastDigit = s.substring(0, s.length() - 1);
        String lastDigit = String.valueOf(s.charAt(s.length() - 1));

        long allButLast = Long.parseLong(allButLastDigit);
        long last = Long.parseLong(lastDigit);

        for (long i = 1; i < p; i++)
        {
            long temp = allButLast + last * i;
            if (temp % p == 0)
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        ArrayList<Long> selectPrimes = new ArrayList<>();
        for (long i = 3; i < Math.pow(10, 7); i+=2)
        {
            if (isPrime(i) && isCoPrimeWith10(i))
            {
                selectPrimes.add(i);
            }
        }
        long sum = 0;
        System.out.println("done");
        for (long p : selectPrimes)
        {
            sum += divMultiplier(p);
        }
        System.out.println(sum);
    }
}
