package problems;
import static problems.MyFunctions.*;

public class Euler47
{
    public static boolean has4PrimeFactors(int i)
    {
        int count = 0;
        for (int j = 2; j <= 1000; j++)
        {
            if (isPrime(j) && i % j == 0)
            {
                count++;
                if (count == 4)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void printPrimeFactors(int i)
    {
        System.out.print("factors of " + i + ": ");
        for (int j = 2; j <= 1000; j++)
        {
            if (isPrime(j) && i % j == 0)
            {
                System.out.print(j + ", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args)
    {


        for (int i = 100000; i <= 10000000; i++)
        {
            if (has4PrimeFactors(i) && has4PrimeFactors(i + 1) && has4PrimeFactors(i + 2) && has4PrimeFactors(i + 3))
            {
                System.out.println(i);
                printPrimeFactors(i);
                printPrimeFactors(i + 1);
                printPrimeFactors(i + 2);
                printPrimeFactors(i + 3);
                break;
            }
        }


    }

}
