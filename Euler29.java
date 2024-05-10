package problems;
import java.util.HashSet;
import java.math.BigInteger;
public class Euler29
{
    public static void main(String[] args)
    {
        HashSet<BigInteger> numSet = new HashSet<BigInteger>();


        for (int a = 2; a <= 100; a++)
        {
            for (int b = 2; b <= 100; b++)
            {
                BigInteger A = BigInteger.valueOf(a);
                BigInteger result;
                result = A.pow(b);
                numSet.add(result);
            }
        }
        System.out.println(numSet.size());
    }
}
