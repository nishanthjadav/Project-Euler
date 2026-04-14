package problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static problems.MyFunctions.*;

public class Euler808
{
    public static boolean isReversiblePrimeSquare(long x, HashSet<Long> primeSquares)
    {
        return !isPalindrome(x) && primeSquares.contains(reversedNum(x));

    }
    public static void main(String[] args) {
        int n = 2000000;
        long[] primes = firstNPrimes(n);

        HashSet<Long> primeSquares = new HashSet<>();
        for(long p : primes)
        {
            primeSquares.add(p * p);
        }
        System.out.println("done generating primes");
        int count = 0;
        long sum = 0;
        for(long sq : primeSquares)
        {
            if(isReversiblePrimeSquare(sq, primeSquares))
            {
                System.out.println(count + ": " + sq);
                count++;
                if(count <= 50)
                {
                    sum += sq;
                }
                if(count > 50)
                {
                    break;
                }
            }
        }
        System.out.println("answer: " + sum);
    }
}
