package problems;
import static problems.MyFunctions.*;
public class Euler4
{
    public static void main(String[] args)
    {
        long maxPalindrome = 0;
        for (int i = 1; i < 999; i++)
        {
            for (int j = 1; j < 999; j++)
            {
                long product = (long) i * j;
                if (isPalindrome(product))
                {
                    if (product > maxPalindrome)
                    {
                        maxPalindrome = product;
                    }
                }
            }
        }
        System.out.println("Largest palindromic product: " + maxPalindrome);

    }
}
