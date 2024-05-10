package problems;

import java.util.ArrayList;
import java.util.Collections;

public class Euler119
{
    public static long digitSum(long n)
    {
        long sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        ArrayList<Long> nums = new ArrayList<>();
        long count = 1;
        for (long i = 3; count <= 30; i++)
        {
            for (long j = 2; j <= 10; j++)
            {
                if (digitSum((long)Math.pow(i, j)) == i)
                {
                    System.out.println("#" + count + ": " + "dig sum of (" + i + "^" + j + ", " + ((long)Math.pow(i, j)) + ")"  + " == " + i);
                    nums.add((long)Math.pow(i, j));
                    count++;
                }
            }
        }
        Collections.sort(nums);
        System.out.println(nums);
    }
}
