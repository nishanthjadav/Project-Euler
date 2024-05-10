package problems;
import static problems.MyFunctions.*;

public class Euler69
{
    public static void main(String[] args)
    {
        int tempNum = 0;
        double largestQuotient = 0;
        int limit = 1000000;
        for (int n = 2; n <= limit; n++)
        {
            int count = 0;
            for (int i = 1; i < n; i++)
            {
                if (gcd(n, i ) == 1 )
                {
                    count++;
                }
            }
            System.out.println("count for " + n + ": " + count );
            if (count != 0)
            {
                double tempQuotient = (double) n / count;
                if (tempQuotient > largestQuotient)
                {
                    largestQuotient = tempQuotient;
                    tempNum = n;
                }
            }
            if (n % 10000 == 0)
            {
                System.out.println(n);
            }
        }
        System.out.println(largestQuotient + " at: " + tempNum);
    }
}
