package problems;
import static problems.MyFunctions.*;


public class Euler131
{
    public static void main(String[] args)
    {
        int count = 0;
        for (long a = 1; ; a++)
        {
            long p = 3 * a * a + 3 * a + 1;
            if (p > 1_000_000)
            {
                break;
            }
            if (isPrime(p))
            {
                System.out.println(p);
                count++;
            }
        }
        System.out.println(count);
    }
}

