package problems;
import java.math.BigInteger;

public class Euler20
{
    public static void main(String[] args)
    {
        int n = 100;
        BigInteger temp = BigInteger.ONE;
        int factSumAddition = 0;

        for (int i = 1; i <= n; i++)
        {
            temp = temp.multiply(BigInteger.valueOf(i));
        }

        String factSum = temp.toString();

        for (int i = 0; i < factSum.length(); i++)
        {
            factSumAddition += Integer.parseInt(String.valueOf(factSum.charAt(i)));
        }

        System.out.println("sum of digits in " + n + "!" + " is " + factSumAddition);


    }
}
