package problems;
import static problems.MyFunctions.*;
public class Euler58
{
    public static void main(String[] args)
    {
        int cornerValue = 1;
        int nonPrimeCornerCount = 0;
        int primeCornerCount = 0;
        int sideLength = 26241; // guess & check
        long maxNum = sideLength * sideLength;
        for (int i = 2; i <= sideLength; i += 2) // difference in corner values go 2, 4, 6, 8, etc
        {
            for (int j = 0; j < 4; j++) // 4 corners per ring
            {
                cornerValue += i;
                if(isPrime(cornerValue) && cornerValue <= maxNum)
                {
                    primeCornerCount++;
                }
                else if (!isPrime(cornerValue) && cornerValue <= maxNum)
                {
                    nonPrimeCornerCount++;
                }
            }
        }
        System.out.println("# of Prime corners: " + primeCornerCount);
        int totalCornerCount = (primeCornerCount + nonPrimeCornerCount + 1);
        System.out.println("# of total corners: " + totalCornerCount);
        double ratio = ((double) primeCornerCount / totalCornerCount) * 100;

        System.out.println("Ratio: " + ratio);




    }
}
