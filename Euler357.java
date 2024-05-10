package problems;
import static problems.MyFunctions.*;

public class Euler357
{
    public static long factorial(long n)
    {
        long product = 1;
        for (int i = 1; i <= n; i++)
        {
            product *= i;
        }
        return product;
    }
    public static long s (long n)
    {
        long i = 1;
        while (true)
        {
            if (factorial(i) % n == 0)
            {
                return i;
            }
            i++;
        }
    }
    public static long sum (long n)
    {
        long sum = 0;
        for (int i = 2; i <= n; i++)
        {
            sum += s(i);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(s(5));
    }

}
