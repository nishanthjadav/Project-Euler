package problems;

public class Euler235
{
    public static long u(long k, double r)
    {
        return (long) ((900 - (3 * k)) * (Math.pow(r, (k - 1))));
    }
    public static void main(String[] args)
    {
        double r = 1.0023221086336;
        long sum = 0;
        for (int i = 1; i <= 5000; i++)
        {
           sum += u(i, r);
            System.out.println(i);
        }
        System.out.println(sum);

    }
}
