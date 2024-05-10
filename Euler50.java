package problems;

import java.util.ArrayList;

import static problems.MyFunctions.*;


public class Euler50
{
//    public static int consecutivePrimeCount(int n, int startVal)
//    {
//        int sum = 0;
//        int count = 0;
//        for (int i = startVal; i <= n; i++)
//        {
//            if (isPrime(i) && sum + i <= n)
//            {
//                sum += i;
//                if (sum <= n)
//                {
//                    count++;
//                }
//            }
//            else if (sum + i > n)
//            {
//                break;
//            }
//        }
//        if (startVal > n)
//        {
//            return -1;
//        }
//        if (sum == n)
//        {
//            return count;
//        }
//        else
//        {
//            return consecutivePrimeCount(n, startVal + 1);
//        }
//
//    }
public static int consecutivePrimeCount(int n)
{
    int sum = 0;
    int count = 0;
    int startVal = 2;
    while (sum != n)
    {
        sum = 0;
        count = 0;
        for (int i = startVal; i <= n; i++)
        {
            if (isPrime(i) && sum + i <= n)
            {
                sum += i;
                if (sum <= n)
                {
                    count++;
                }
            }
            else if (sum + i > n)
            {
                break;
            }
        }
        if (startVal > n / 10)
        {
            return -1;
        }
        startVal++;

    }
    return count;
}
    public static void main(String[] args)
    {
       //System.out.println(consecutivePrimeCount(31991));
        int largestChain = 0;
        int primeVal = 0;
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 953; i < 1000000; i+=2)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }
        }
        for (int i : primes)
        {
            int currChain = consecutivePrimeCount(i);
            if (currChain > largestChain)
            {
                largestChain = currChain;
                primeVal = i;
            }


        }
        System.out.println("prime num " + primeVal + " has the largest chain with " + largestChain + " consecutive prime numbers which equal it");



    }

}