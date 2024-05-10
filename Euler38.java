package problems;
import static problems.MyFunctions.*;

public class Euler38
{
    public static void main(String[] args)
    {
        StringBuilder productConcat = new StringBuilder();
        long icopy = 0;
        long maxProduct = 0;
        for (int i = 1; i <= 10000; i++)
        {
            productConcat.setLength(0);
            for (int j = 1; j <= 50; j++)
            {
                productConcat.append(i * j);
                if (productConcat.length() == 9 && isPandigital(String.valueOf(productConcat)))
                {
                    long pandigitalNum = Long.parseLong(String.valueOf(productConcat));
                    if (pandigitalNum >  maxProduct)
                    {
                        maxProduct = pandigitalNum;
                        icopy = i;
                    }
                }
                else if (productConcat.length() > 9)
                {
                    break;
                }
            }

        }
        System.out.println("largest pandigital: " + maxProduct + " at i value: " + icopy);


    }
}
