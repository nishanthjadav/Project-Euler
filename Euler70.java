package problems;

import java.util.Arrays;

import static problems.MyFunctions.*;

public class Euler70
{
    public static void main(String[] args)
    {

        double smallestRatio = Double.MAX_VALUE;
        int tempNum = 0;
        int limit = 10_000_000;
        for (int i = 2; i < limit; i++)
        {
            int tempTotient = totient(i);
            double ratio = (double) i / tempTotient;

            if (arePermutations(i, tempTotient) && ratio < smallestRatio)
            {
                smallestRatio = ratio;
                tempNum = i;
            }
            if (i % 100000 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println("smallest ratio: " + smallestRatio + ", found at: " + tempNum);
    }
}
