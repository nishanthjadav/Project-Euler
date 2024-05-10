package problems;
import static problems.MyFunctions.*;

public class Euler407
{
    public static long M(long n)
    {
        long largest = 0;
        for (long a = n - 1; a >= 0; a--)
        {
            long tempCalc = (a * a) % n;
            if (tempCalc == a)
            {
                largest = a;
                break;
            }
        }
        return largest;
    }

    public static void main(String[] args)
    {
        long sum = 0;
        for (long i = 1; i <= Math.pow(10, 7); i++)
        {
            sum += M(i);
            if (i % 10000 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println(sum);


    }
}
