package problems;

public class Euler10
{
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long n = 2000000;
        long sumOfPrimes = 0;

        for (long i = 3; i <= n; i+=2) {
            if (isPrime(i)) {
                sumOfPrimes += i;
            }
        }

        System.out.println("Sum of Primes: " + sumOfPrimes + 2);
    }
}
