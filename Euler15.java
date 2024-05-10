package problems;
import java.math.BigInteger;
public class Euler15
{
    public static void main(String[] args)
    {
        BigInteger temp1 = new BigInteger("1");
        BigInteger temp2 = new BigInteger("1");
        BigInteger temp3 = new BigInteger("1");
        int n = 40;
        int k = 20;
        for (int i = 1; i <= n; i++) // temp =  40 factorial
        {
            temp1 = temp1.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= k; i++) // temp2 = 20 factorial
        {
            temp2 = temp2.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= n - k; i++)
        {
            temp3 = temp3.multiply(BigInteger.valueOf(i));
        }
        BigInteger answer = temp1.divide(temp2.multiply(temp3));
        System.out.println("Answer: " + answer);
    }
}

