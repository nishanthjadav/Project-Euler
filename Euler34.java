package problems;
import java. util.ArrayList;

public class Euler34
{
    public static long Factorial(long n)
    {
        long result  = 1;
        for (long i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
    public static ArrayList<Long> numSums(long n)
    {
        ArrayList<Long> numSums = new ArrayList<>();
        while (n > 0)
        {
            numSums.add(n % 10);
            n /= 10;
        }
        return numSums;
    }
    public static long FactSum  (ArrayList<Long> numSums)
    {
        long sum = 0;
        for (long i : numSums)
        {
            sum += Factorial(i);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        long sum = 0;
        for (long num = 3; num < 100000; num++)
        {
            if (FactSum(numSums(num)) == num)
            {
                sum += num;
            }
        }
        System.out.println(sum);

    }
}
