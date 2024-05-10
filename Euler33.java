package problems;

public class Euler33
{
    public static void main(String[] args)
    {

        for (double i = 11; i <= 99; i++)
        {
            for (double j = 11; j <= 99; j++)
            {
                int digiti1 = (int) (i  / 10);
                int digiti2 = (int) (i % 10);

                int digitj1 = (int) (j  / 10);
                int digitj2 = (int) (j % 10);

                if (i / j < 1)
                {
                    if (((digiti1 == digitj1 || digiti1 == digitj2 || digitj1 == digiti2)) && ( i / j == (double) digiti1 / digitj2 || i / j == (double) digiti2 / digitj1))
                    {
                        System.out.println(i + " / " + j + " is a curious fraction");
                    }
                }

            }
        }



    }
}
