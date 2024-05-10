package problems;

public class Euler9
{
    public static void main(String[] args)
    {
        for (int a = 1; a < 1000; a++)
        {
            for (int b = 1; b < 1000; b++)
            {
                int c = 1000 - a - b;
                if ((a * a) + (b * b) == c * c)
                {
                    System.out.println(a + ", " + b + ", " + c);
                    System.out.println("answer: " + a * b * c);
                    return;
                }
            }
        }
    }
}
