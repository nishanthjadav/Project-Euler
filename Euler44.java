package problems;

import java.util.HashSet;
import java.util.Set;

public class Euler44
{

    public static void main(String[] args)
    {
        Set<Long> pentagonalNumList = new HashSet<>();

        long minDiff = Long.MAX_VALUE;

        for (int i = 1; i <= 3000; i++)
        {
            long pentagonalNum = i * (3 * i - 1) / 2;
            pentagonalNumList.add(pentagonalNum);
        }

        for (long p1 : pentagonalNumList)
        {
            for(long p2 : pentagonalNumList)
            {
                long sum = p1 + p2;
                long diff = Math.abs(p2 - p1);

                if (pentagonalNumList.contains(sum) && pentagonalNumList.contains(diff))
                {
                    if (diff < minDiff)
                    {
                        minDiff = diff;
                    }
                }
            }
        }
        System.out.println("minimal diff in pentagonal pairs: " + minDiff);
    }
}
