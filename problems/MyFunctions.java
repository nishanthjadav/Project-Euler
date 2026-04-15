package problems;
import java.math.BigInteger;
import java.util.*;

public class MyFunctions
{
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
    public static long factorial(long n) {
        long res = 1L;
        for (long i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return original == reversed;
    }
    public static boolean isPalindrome(long n) {
        long original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return original == reversed;
    }
    public static int totient(int n) {
        int result = n;
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                while (n % p == 0) n /= p;
                result -= result / p;
            }
        }
        if (n > 1) result -= result / n;
        return result;
    }

    public static boolean arePermutations(int a, int b) {
        int[] count = new int[10];

        while (a > 0) {
            count[a % 10]++;
            a /= 10;
        }

        while (b > 0) {
            count[b % 10]--;
            b /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }

    public static boolean isPandigital(int n) {
        int mask = 0;
        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (d == 0) return false;
            int bit = 1 << d;
            if ((mask & bit) != 0) return false;
            mask |= bit;
            count++;
            n /= 10;
        }

        return mask == 0b1111111110 && count == 9;
    }

    public static boolean isPandigital(String s) {
        int len = s.length();
        int mask = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c < '1' || c > '9') return false;

            int bit = 1 << (c - '0');
            if ((mask & bit) != 0) return false;
            mask |= bit;
        }

        for (int i = 1; i <= len; i++) {
            if ((mask & (1 << i)) == 0) return false;
        }

        return true;
    }
    public static long reversedNum(long n) {
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public static int reversedNum(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
    public static long[] firstNPrimes(int n) {
        if (n <= 0) return new long[0];

        int limit = estimateNthPrimeUpperBound(n);

        boolean[] isPrime = sieve(limit);

        long[] primes = new long[n];
        int count = 0;

        for (int i = 2; i < isPrime.length && count < n; i++) {
            if (isPrime[i]) {
                primes[count++] = i;
            }
        }

        return primes;
    }

    public static boolean[] sieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        if (limit >= 0) isPrime[0] = false;
        if (limit >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
    private static int estimateNthPrimeUpperBound(long n) {
        if (n < 6) return 15;

        double nn = n;
        return (int) (nn * (Math.log(nn) + Math.log(Math.log(nn)))) + 10;
    }
    public static BigInteger partition(int n) {
        // using Euler's pentagonal theorem
        BigInteger[] p = new BigInteger[n + 1];
        p[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            p[i] = BigInteger.ZERO;
        }

        for (int i = 1; i <= n; i++) {
            BigInteger sum = BigInteger.ZERO;
            for (int k = 1;; k++) {
                int g1 = k * (3 * k - 1) / 2;
                int g2 = k * (3 * k + 1) / 2;

                if (g1 > i && g2 > i) break;

                BigInteger sign = (k % 2 == 0) ? BigInteger.valueOf(-1) : BigInteger.ONE;

                if (g1 <= i) sum = sum.add(sign.multiply(p[i - g1]));
                if (g2 <= i) sum = sum.add(sign.multiply(p[i - g2]));
            }
            p[i] = sum;
        }
        return p[n];
    }
}
