package problems;
import java.math.BigInteger;

import static problems.MyFunctions.*;

public class Euler104
{
    public static void main(String[] args)
    {
        BigInteger term1 = BigInteger.ZERO;
        BigInteger term2 = BigInteger.ONE;
        BigInteger next;

        for (int i = 1; i <= 500000; i++)
        {
            next = term1.add(term2);
            term1 = term2;
            term2 = next;
            String temp = String.valueOf(term1);
           // System.out.println(i + ": " + term1);
            try
            {
                if(isPandigital(temp.substring(String.valueOf(term1).length() - 9, String.valueOf(term1).length())) && isPandigital(temp.substring(0, 9)))
                {
                    System.out.println(i);
                    break;
                }
            }
            catch (Exception ignored)
            {

            }
            if ((i % 10000) == 0)
            {
                System.out.println(i);
            }

        }
    }
}
