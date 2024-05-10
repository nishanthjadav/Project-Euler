package problems;

public class Euler5
{
    public static boolean isDivisible(int num)
    {
        for (int i = 1; i <= 20; i++)
        {
            if (num % i != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n = 1;
        while (true)
        {
            if (isDivisible(n))
            {
                System.out.println("Answer: " + n);
                break;
            }
            n++;
        }
    }
}
