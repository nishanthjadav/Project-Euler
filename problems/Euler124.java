package problems;
import static problems.MyFunctions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Euler124 
{
    public static long rad(long n)
    {
        List<Long> pfactors = new ArrayList<>();
        long div = 2;
        while(n > 1)
        {
            if(isPrime(div))
            {
                if(n % div == 0) pfactors.add(div);
                while(n % div == 0)
                {
                    n /= div;
                }
            }
            div++;
        }
        long res = 1;
        for(long num : pfactors) res *= num;

        return res;
    }
    public static void main(String[] args) 
    {
        Map<Long, List<Long>> radMap = new HashMap<>();
        for(long i = 1; i <= 100_000; i++)
        {
            if(i % 1_000 == 0) System.out.println(i);
            radMap.computeIfAbsent(rad(i),k -> new ArrayList<>()).add(i);
        }
        //System.out.println(radMap);
        
        List<Long> nvals = new ArrayList<>();
        for(Map.Entry<Long, List<Long>> e : radMap.entrySet())
        {
            nvals.addAll(e.getValue());
        }
        System.out.println(nvals.get(9999));
    }
}
