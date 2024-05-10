package problems;
import java.math.BigInteger;

public class Euler48
{
    public static void main(String[] args)
    {

        BigInteger n = new BigInteger("1000");
        BigInteger sum = new BigInteger("0");
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE))
        {
            sum = sum.add(i.pow(i.intValue()));
        }
        System.out.println(sum);
    }
}
