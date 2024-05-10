package problems;
import java.util.ArrayList;

import static problems.MyFunctions.*;

public class Euler74
{
    static long chainCount = 1;
    static ArrayList<Long> used = new ArrayList<>();

    public static long chainLength(long n)
    {

        long sum = 0;
        long temp = n;
        while (temp > 0)
        {
            long digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        chainCount++;
        if (chainCount > 61)
        {
            return -1;
        }
        if (used.contains(sum))
        {
            return chainCount - 1;
        }
        else {
            used.add(sum);
            return chainLength(sum);
        }
    }
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();

        int count = 0;
        for (int i = 1; i < 1000000; i++)
        {
            chainCount = 1;
            used.clear();
            long temp = chainLength(i);
            if (temp == 60)
            {
                count++;
            }
        }
        System.out.println(count);


        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime / Math.pow(10,6));

        //System.out.println(chainLength(999919));
    }
}
