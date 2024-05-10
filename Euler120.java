package problems;

public class Euler120
{
    public static long remainder(long a, long n)
    {
        long term1 = ((a - 1) * n) % (a * a);
        long term2 = ((a + 1) * n) % (a * a);
        return (term1 + term2) % (a * a);
    }
    public static long maxRemainder (long a)
    {
        long maxRemainder = 0;
        for (int n = 1; n <= a * 2; n++)
        {
            long temp = remainder(a, n);
            if (temp > maxRemainder)
            {
                maxRemainder = temp;
            }
        }
        return maxRemainder;
    }
    public static void main(String[] args)
    {
        long maxRemainderSum = 0;
        for (int a = 3; a <= 1000; a++)
        {
           maxRemainderSum += maxRemainder(a);
        }
        System.out.println(maxRemainderSum);
    }
}
