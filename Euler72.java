package problems;


import static problems.MyFunctions.*;

public class Euler72
{
    public static long fractionSetCount (int limit)
    {
        long count = 0;

        for (int d = 2; d <= limit; d++)
        {
            for (int n = 1; n < d; n++)
            {
                if (gcd(n , d) == 1)
                {
                    count++;
                }
            }
           if (d % 10000 == 0)
           {
               System.out.println(d);
           }
        }
        return count;
    }
    public static void main(String[] args)
    {

        System.out.println("d = 1000000: " + (fractionSetCount(1000000)));


    }
}
