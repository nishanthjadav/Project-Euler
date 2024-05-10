package problems;
import java.util.HashMap;
import java.util.Map;
public class Euler92
{
    public static void main(String[] args)
    {

        int count = 1;
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 1; i < 10000000; i++)
        {
            int n = i;
            while (n != 1 && n != 89)
            {
                if(cache.containsKey(n))
                {
                    n = cache.get(n);
                }
                else
                {
                    int tempNumber = n;
                    n = 0;
                    while (tempNumber > 0)
                    {
                        int digit = tempNumber % 10;
                        n += digit * digit;
                        tempNumber /= 10;
                    }
                }
                if (n == 89)
                {
                    count++;
                }
                cache.put(i, n);
            }

        }
        System.out.println(count);

    }
}
