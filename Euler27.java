package problems;
import java.util.ArrayList;

import static problems.MyFunctions.*;

public class Euler27
{
    public static void main(String[] args)
    {
       ArrayList<Integer> primeList = new ArrayList<>();
       primeList.add(2);
       for (int i = 3; i <= 1000; i+=2)
       {
           if(isPrime(i))
           {
               primeList.add(i);
           }
       }
       int largest = 0;
       int prod = 1;

           for (int a = -999; a < 1000; a++)
           {
               for (int b : primeList) // b has to be prime cuz plugging in zero for n leaves just b
               {
                   if (!isPrime(1 + a + b))
                   {
                       continue; // Skip iteration if 1 + a + b is not prime (when n = 1, 1 + a + b must be prime)
                   }

                   int consecPrimeCount = 0;
                   int n = 0;
                   while (isPrime((long) n * n + (long) a * n + b))
                   {
                       consecPrimeCount++;
                       n++;
                   }
                   if (consecPrimeCount > largest)
                   {
                       largest = consecPrimeCount;
                       prod = a * b;
                   }
               }

           }

        System.out.println("producs of coef with max consec primes: " + prod);

    }
}
