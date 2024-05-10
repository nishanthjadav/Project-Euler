package problems;
import static problems.MyFunctions.*;

public class Euler187
{
    public static boolean numOfPrimeFactors (int n)
    {
        int count = 0;
        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++)
        {
            if (n % i == 0 && isPrime(i))
            {
                while (n % i == 0)
                {
                    n /= i;
                    count++;
                }
                if (count > 1 || n == 1)
                {
                    break;
                }
            }
        }
        if (n > 1)
        {
            count++;
        }
        return count == 2;
    }
    public static void main(String[] args)
    {
        int count = 0;
       int limit = 100000000;

        for (int i = 1; i < limit; i++)
        {
            if (numOfPrimeFactors(i))
            {
                count++;
                //System.out.println(i);
            }
            if (i % 1000000 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
