package problems;

public class Euler31
{
    public static void main(String[] args)
    {
        int ways = 0;
        double startTime = System.currentTimeMillis();
        for (int a = 0; a <= 1; a++)
        {
            for (int b = 0; b <= 2; b++)
            {
                for (int c = 0; c <= 4; c++)
                {
                    for (int d = 0; d <= 10; d++)
                    {
                        for (int e = 0; e <= 20; e++)
                        {
                            for (int f = 0; f <= 40; f++)
                            {
                                for (int g = 0; g <= 100; g++)
                                {
                                    for (int h = 0; h <= 200; h++)
                                    {
                                        int total = a * 200 + b * 100 + c * 50 + d * 20 + e * 10 + f * 5 + g * 2 + h;
                                        if (total == 200)
                                        {
                                            ways++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        double endTime = System.currentTimeMillis();
        System.out.println("number of ways to make £2 using british coins: " + ways);
        System.out.println("processing time: " + (endTime - startTime) / 1000.0 + "s");
    }
}
