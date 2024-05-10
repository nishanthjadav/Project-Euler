package problems;
import java.util.ArrayList;
import java.util.List;
public class Euler7
{
    public static boolean isPrime(long n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (long i = 2; i * i <= n; i++)
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
        long n = 1000000000; // random number to increment up to in order to ensure that primeCount can reach 10001
        ArrayList<Long> primeCount = new ArrayList<>();

        for (long i = 2; i <= n; i++)
        {
            if (isPrime(i))
            {
                primeCount.add(i);
                if (primeCount.size() == 10001)
                {
                    System.out.println(i);
                    break; // Stop when the 10001st prime is found
                }
            }
        }
    }
}
