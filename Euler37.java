package problems;

public class Euler37 {
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
        int term1, term2, term3, term4, term5, term6, term7, term8, termy, termz, termw, terml;
        int sum = 0;

        for (int i = 10; i < 1000000; i++) {
            if (i < 100) {
                term1 = i % 10;
                term2 = i % 100;
                term7 = i % 10000 / 10;
                term8 = i % 10000;
                if (isPrime(term1) && isPrime(term2) && isPrime(term7) && isPrime(term8)) {
                    System.out.println(i);
                    sum += i;
                }
            } else if (i < 1000 && i >= 100) {
                term1 = i % 10;
                term2 = i % 100;
                term3 = i % 1000;
                term6 = i % 10000 / 100;
                term7 = i % 10000 / 10;
                term8 = i % 10000;
                if (isPrime(term1) && isPrime(term2) && isPrime(term3) && isPrime(term6) && isPrime(term7) && isPrime(term8)) {
                    System.out.println(i);
                    sum += i;
                }
            } else if (i < 10000 && i >= 1000) {
                term1 = i % 10;
                term2 = i % 100;
                term3 = i % 1000;
                term4 = i % 10000;
                term5 = i % 10000 / 1000;
                term6 = i % 10000 / 100;
                term7 = i % 10000 / 10;
                term8 = i % 10000;
                if (isPrime(term1) && isPrime(term2) && isPrime(term3) && isPrime(term4) && isPrime(term5) && isPrime(term6) && isPrime(term7) && isPrime(term8)) {
                    System.out.println(i);
                    sum += i;
                }
            } else if (i < 100000 && i >= 10000) {
                term1 = i % 10;
                term2 = i % 100;
                term3 = i % 1000;
                term4 = i % 10000;
                termz = i % 100000;
                termy = i % 100000 / 10000;
                term5 = i % 100000 / 1000;
                term6 = i % 100000 / 100;
                term7 = i % 100000 / 10;
                term8 = i % 100000;
                if (isPrime(term1) && isPrime(term2) && isPrime(term3) && isPrime(term4) && isPrime(termz) && isPrime(termy) && isPrime(term5) && isPrime(term6) && isPrime(term7) && isPrime(term8)) {
                    System.out.println(i);
                    sum += i;
                }
            } else if (i < 1000000 && i >= 100000) {
                term1 = i % 10;
                term2 = i % 100;
                term3 = i % 1000;
                term4 = i % 10000;
                termz = i % 100000;
                termw = i % 1000000;
                terml = i % 1000000 / 100000;
                termy = i % 1000000 / 10000;
                term5 = i % 1000000 / 1000;
                term6 = i % 1000000 / 100;
                term7 = i % 1000000 / 10;
                term8 = i % 1000000;
                if (isPrime(term1) && isPrime(term2) && isPrime(term3) && isPrime(terml) && isPrime(termw) && isPrime(term4) && isPrime(termz) && isPrime(termy) && isPrime(term5) && isPrime(term6) && isPrime(term7) && isPrime(term8)) {
                    System.out.println(i);
                    sum += i;
                }
            }
        }
        System.out.println("sum of truncatable primes: " + sum);
    }
}
