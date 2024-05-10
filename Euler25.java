package problems;
import java.math.BigInteger;
public class Euler25
{
    public static void main(String[] args)
    {
        BigInteger term1 = BigInteger.ZERO;
        BigInteger term2 = BigInteger.ONE;
        BigInteger next;
        BigInteger n = new BigInteger("10000000");
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) < 0; i = i.add(BigInteger.ONE))
        {
            next = term1.add(term2);
            term1 = term2;
            term2 = next;
            int length = String.valueOf(term1).length();
            if (length == 1000)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
