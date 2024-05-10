package problems;
public class Euler23 {
    public static boolean isAbundant(long n) {
        long sum = 1;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }

        }
        return sum > n;
    }

    public static void main(String[] args) {

        long sum = 0;
        for (long i = 1; i <= 28123; i++) {
            boolean canBeWritten = false;
            for (long j = 1; j <= i / 2; j++) {

                if (isAbundant(j) && isAbundant(i - j)) {
                    canBeWritten = true;
                    break;
                }
            }
            if (!canBeWritten) {
                sum += i;
            }
        }
        System.out.println("sum of all positive integers that cannot be written as the sum of two abundant numbers: " + sum);
    }
}

