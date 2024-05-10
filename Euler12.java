package problems;
import java.util.ArrayList;
import java.util.List;
public class Euler12
{
    public static void main(String[] args)
    {
        long n = 1;

        while (true)
        {
            List<Long> factorCount = new ArrayList<>();
            long triangleNums = 0;

            for (long i = 1; i <= n; i++)
            {
                triangleNums += i;
            }

            for (long j = 1; j * j <= triangleNums; j++)
            {
                if (triangleNums % j == 0)
                {
                    if (triangleNums / j == j)
                    {
                        factorCount.add(j);
                    }
                    else
                    {
                        factorCount.add(j);
                        factorCount.add(triangleNums / j);
                    }
                }
            }

            if (factorCount.size() > 500)
            {
                System.out.println(triangleNums);
            }

            if (factorCount.size() > 550)
            {
                break;
            }

            n++;
        }
    }
}
