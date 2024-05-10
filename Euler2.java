package problems;

public class Euler2
{

    public static void main(String[] args) {
        int term1 = 0;
        int term2 = 1;
        int next;
        int n = 50;
        int sumEven = 0;

        for (int i = 0; i < n; i++) {
            next = term1 + term2;
            term1 = term2;
            term2 = next;

            if (term1 % 2 == 0 && term1 < 4000000)
            {
                    sumEven += term1;
                    System.out.print(term1 + ",");

            }
        }

        System.out.println("\nFinal Sum: " + sumEven);
    }
}


