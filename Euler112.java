package problems;

public class Euler112
{
    public static boolean isIncreasing(int n)
    {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++)
        {
            try
            {
                if ((int)s.charAt(i) > (int)s.charAt(i + 1))
                {
                    return false;
                }
            } catch (Exception ignored) {}
        }
        return true;
    }
    public static boolean isDecreasing(int n)
    {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++)
        {
            try
            {
                if ((int)s.charAt(i) < (int)s.charAt(i + 1))
                {
                    return false;
                }
            } catch (Exception ignored) {}
        }
        return true;
    }
    public static boolean isBouncy(int n)
    {
        return !isDecreasing(n) && !isIncreasing(n);
    }
    public static void main(String[] args)
    {
        int bouncyCount = 0;
        int limit = 1586990; // random guess
        while (true)
        {
            int temp = 0;
            bouncyCount = 0;
            for (int i = 1; i <= limit; i++)
            {
                if (isBouncy(i))
                {
                    bouncyCount++;
                }
                temp = i;
            }
            double ratio = (double)bouncyCount / limit;
            System.out.println(temp + ": " + ratio);
            limit++;
            if (ratio == 0.99)
            {
                System.out.println(limit);
                break;
            }
        }


    }
}
