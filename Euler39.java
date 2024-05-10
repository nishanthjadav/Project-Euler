package problems;

public class Euler39
{
    public static int triangleCalc(int n)
    {
        int count = 0;
        for (int a = 1; a <= n; a++)
        {
            for (int b = a; b <= n - a; b++)
            {
                int c = n - a - b;
                    if (((a * a) + (b * b) == c * c))
                    {
                        if (a > b)
                        {
                            break;
                        }
                        count++;
                    }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {

      int largest = 0;
      int numWithMaxSolutions = 0;
      for (int i = 1; i <= 1000; i++)
      {
          System.out.println(i + ": " + triangleCalc(i));
          int solutions = triangleCalc(i);
          if (solutions > largest)
          {
              largest = solutions;
              numWithMaxSolutions = i;
          }
      }
      System.out.println(numWithMaxSolutions + " is the num with the most solutions of: " + largest);
    }
}
