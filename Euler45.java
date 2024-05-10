package problems;

public class Euler45
{
    public static long Triangle (long n)
    {
        return n * (n + 1)/2;
    }

    public static void main(String[] args)
    {
        for (long i = 284; i <= 1000000; i++)
        {
            double pent1 = (1 + Math.sqrt(1 - 4 * 3 * -1 * 2 * Triangle(i))) / 6;
            double pent2 = (1 - Math.sqrt(1 - 4 * 3 * -1 * 2 * Triangle(i))) / 6;

            double hex1 = (1 + Math.sqrt(1 - 4 * 2 * -1  * Triangle(i))) / 4;
            double hex2 = (1 - Math.sqrt(1 - 4 * 3 * -1  * Triangle(i))) / 4;

            boolean temp = ((long)pent1 == pent1 && pent1 > 0 ) || ((long)pent2 == pent2 && pent2 > 0);
            boolean temp1 = ((long)hex1 == hex1 && hex1 > 0 ) || ((long)hex2 == hex2 && hex2 > 0);


            if (temp && temp1)
            {
               System.out.println(Triangle(i));
            }
        }




    }
}
