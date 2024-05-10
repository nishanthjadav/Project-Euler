package problems;

public class Euler41
{
    public static boolean isPandigital (long n)
    {
        String numString = String.valueOf(n);
        int length = numString.length();
        boolean [] digits = new boolean[length + 1];

        for (int i = 0; i < length; i++)
        {
            char currentChar = numString.charAt(i);

            if (currentChar == '0' || currentChar > (char) ('0' + length) || digits[currentChar - '0'])
            {
                return false;
            }
            digits[currentChar - '0'] = true;
        }

        for (int i = 1; i <= length; i++)
        {
            if (!digits[i]) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrime(long n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (long i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        for (long i = 2143; i <= 9999999; i++)
        {
            if (isPandigital(i) && isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}
