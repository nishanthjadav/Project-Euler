package problems;

public class Euler6
{
    public static void main(String[] args)
    {
    int n = 100;
    int sum = 0;

    // Calculate the sum of squares
    for (int i = 0; i <= n; i++)
    {
        sum += i * i;
    }

    System.out.println("Sum of squares of first " + n + " numbers: " + sum);

    int sumS = 0;
    for (int k = 0; k <= n; k++)
    {
        sumS += k;
    }

    int sumF = sumS * sumS;
    System.out.println("Square of the sum of the first " + n + " numbers: " + sumF);

    int finalAnswer = sumF - sum;

    System.out.println("Final Answer: " + finalAnswer);
}
}
