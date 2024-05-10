package problems;
import java.math.BigInteger;
public class Euler97
{
    public static void main(String[] args)
    {
        int temp = 28433;
        int exponent = 7830457;

        BigInteger num;
        num = new BigInteger("2");
        BigInteger result = (num.pow(exponent)).multiply(BigInteger.valueOf(temp)).add(BigInteger.valueOf(1));
        String s = result.toString();
        System.out.println(s);


    }


}
