package problems;
import java.math.BigInteger;
public class Euler16
{
    public static void main(String[] args) {
        BigInteger powerOfTwo = BigInteger.valueOf(2).pow(1000);
        String numberAsString = powerOfTwo.toString();

        int sumOfDigits = 0;
        for (int i = 0; i < numberAsString.length(); i++)
        {
            char digitChar = numberAsString.charAt(i);
            int digitValue = Character.getNumericValue(digitChar);
            sumOfDigits += digitValue;
        }

        System.out.println("2^1000 = " + powerOfTwo);
        System.out.println("Sum of its digits = " + sumOfDigits);
    }
}
