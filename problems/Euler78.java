package problems;

import java.math.BigInteger;

public class Euler78
{
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
    public static void main(String[] args) {
        for(int i = 1;; i++)
        {
            BigInteger curr = partition(i);
            if(i % 1000 == 0) System.out.println(i + ": " + curr);
            if(curr.mod(BigInteger.valueOf(1_000_000L)).equals(BigInteger.ZERO))
            {
                System.out.println("answer: " + i);
                break;
            }
        }
    }
}
