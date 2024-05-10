package problems;
import java.math.BigInteger;

public class Euler57
{
    public static void main(String[] args)
    {
        BigInteger numerator = BigInteger.valueOf(3);
        BigInteger denominator = BigInteger.valueOf(2);
        int count = 0;

        for (int i = 1; i <= 1000; i++)
        {
            BigInteger temp = numerator;
            numerator = numerator.add(denominator.multiply(BigInteger.valueOf(2))); // new numerator is double denominator + previous numerator
            denominator = temp.add(denominator); // new denominator is previous numerator + previous denominator

            if (numerator.toString().length() > denominator.toString().length())
            {
                count++;
            }
        }
        System.out.println(count);

    }


}
