package problems;

import java.util.ArrayList;
import java.util.Collections;

public class Euler95
{
    public static void main(String[] args)
    {
        long longestLength = 0;
        long smallestMember = 0;
        for(long i = 1; i <= 1000000; i++)
        {
            ArrayList<Long> chain = isAmicableChain(i);
            if(chain != null && chain.size() > longestLength)
            {
                Collections.sort(chain);
                smallestMember = chain.getFirst();
            }
            if(i%10000==0)
            {
                System.out.println(i);
                System.out.println(smallestMember);
                System.out.println();
            }
        }
        System.out.println(smallestMember);
    }
    static ArrayList<Long> isAmicableChain(long i)
    {
        ArrayList<Long> chain = new ArrayList<>();
        while(!chain.contains(i) && (chain.size() < 30))
        {
            chain.add(sumOfDivisors(chain.isEmpty()?i:chain.getLast()));
        }
        if(!chain.contains(i))
            return null;
        return chain;
    }
    static long sumOfDivisors(long n)
    {
        long sum = 1;
        for(long i = 2; i*i<n; i++)
        {
            if(n%i==0)
            {
                sum+=i;
                sum+=n/i;
            }
        }
        return sum;
    }
}
