package problems;

public class Euler204
{
    public static boolean isHammingNumber(long n, int type)
    {
        for (int i = 2; i <= type; i++)
        {
            while (n % i == 0)
            {
                n /= i;
            }
        }
        return n == 1;
    }
    public static void main(String[] args)
    {
        long count = 1;
        for (int i = 1; i < Math.pow(10, 9); i++)
        {
            if(i % 10000000 == 0)
            {
                System.out.println(i);
            }
            if (isHammingNumber(i, 100))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
