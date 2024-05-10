package problems;

public class Euler30
{
    public static void main(String[] args)
    {
        int totalSum = 0;
        for (int i = 2; i<= 1000000; i++)
        {
            int sum = 0;
            int tempNum = i;
            while (tempNum != 0)
            {
                int digit = tempNum % 10;
                tempNum /= 10;
                sum += Math.pow(digit, 5);
            }
            if (sum == i)
            {
                System.out.println(sum);
                totalSum += sum;
            }
        }
        System.out.println("totalSum = " + totalSum);

    }
}
