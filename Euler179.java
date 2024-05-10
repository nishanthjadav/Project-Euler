package problems;

public class Euler179
{
    public static int divisorCount(int n)
    {

        int count = 0;
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; i++)
        {
            if (n % i == 0)
            {
                count += 2; // Accounting for both i and n/i
            }
        }

        // If n is a perfect square, only count its square root once
        if (sqrtN * sqrtN == n)
        {
            count--;
        }

        return count;
    }
    public static void main(String[] args)
    {
        int count = 0;

        for (int i = 1; i < 10000000; i++)
        {
            if (i % 100000 == 0)
            {
                System.out.println(i);
            }
            if (divisorCount(i) == divisorCount(i + 1))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
