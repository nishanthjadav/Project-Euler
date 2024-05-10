package problems;
import java.util.HashSet;
public class Euler21
{
    static int d (int a)
    {
        int sum = 0;
        for (int i = 1; i< a; i++)
        {
            if (a % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    static int f (int b)
    {
        int sum = 0;
        for (int i = 1; i< b; i++)
        {
            if (b % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        HashSet<Integer> amicableNumList = new HashSet<Integer>();
        int count = 0;
        int sum = 0;
        for (int i = 1; i<= 10000; i++)
        {
            if(i != d(i) && i == d(f(i)))
            {
                count++;
                System.out.println(d(i));
                System.out.println(f(d(i)));
                int pairSum = d(i) + f(d(i));
                amicableNumList.add(pairSum);
                System.out.println("Amicable pair# " + count);
            }
        }

        for (int i : amicableNumList)
        {
            sum+=i;
        }
        System.out.println("List of sums of amicable pairs " + amicableNumList);

        System.out.println("Sum: " + sum);

    }
}
