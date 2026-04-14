package problems;

public class Euler003
{
    static void primeFactors(long num)
    {
        long divisor = 2;
        while (num > 1) {
            while (num % divisor == 0) {
                System.out.print(divisor + ", ");
                num = num / divisor;
            }
            divisor++;
        }
    }
    public static void main(String[] args)
    {
        long num = 600851475143L;
        primeFactors(num);
    }

}
