package problems;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static problems.Euler211.isPerfectSquare;

public class Euler80
{
    public static int digitalSum(BigDecimal dec)
    {
        String s = dec.toString();
        int digitalSum = 0;
        for (char c : s.toCharArray())
        {
            if (c != '.')
            {
                digitalSum += (c - '0');
            }
        }
       return digitalSum;
    }

    public static void main(String[] args)
    {

        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            if (!isPerfectSquare(i))
            {
                BigDecimal b = new BigDecimal(i);
                MathContext mc = new MathContext(100, RoundingMode.DOWN);
                BigDecimal sqrt = b.sqrt(mc);
                sum += digitalSum(sqrt);
            }
        }
        System.out.println(sum);
    }
}
