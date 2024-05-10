package problems;
import java.util.ArrayList;
import java.util.List;
public class Euler14
{
    public static void main(String[] args)
    {
        long longestChain = 0;
        long numWithLongestChain = 0;

        for (long i = 1; i <= 1000000; i++)
        {
            long n = i;
            List<Long> collatzCount = new ArrayList<>();

            int count = 0;
            while (n > 1)
            {
                if (n % 2 != 0)
                {
                    n = (3 * n) + 1;
                }
                else
                {
                    n = n / 2;
                }
                collatzCount.add(n);
                count++;

                if (count > longestChain)
                {
                    longestChain = count;
                    numWithLongestChain = i;
                }
            }
        }

        System.out.println("Number with longest chain: " + numWithLongestChain);
    }
}
