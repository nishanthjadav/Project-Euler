package problems;

import java.util.Arrays;

public class Euler52
{
    public static boolean arePermutations(int num1, int num2, int num3, int num4, int num5, int num6) {
        char[] charArray1 = Integer.toString(num1).toCharArray();
        char[] charArray2 = Integer.toString(num2).toCharArray();
        char[] charArray3 = Integer.toString(num3).toCharArray();
        char[] charArray4 = Integer.toString(num4).toCharArray();
        char[] charArray5 = Integer.toString(num5).toCharArray();
        char[] charArray6 = Integer.toString(num6).toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Arrays.sort(charArray3);
        Arrays.sort(charArray4);
        Arrays.sort(charArray5);
        Arrays.sort(charArray6);

        return Arrays.equals(charArray1, charArray2) && Arrays.equals(charArray2, charArray3) && Arrays.equals(charArray3, charArray4) && Arrays.equals(charArray4, charArray5) && Arrays.equals(charArray5, charArray6);
    }
    public static void main(String[] args)
    {
        for (int i = 1; i <= 1000000; i++)
        {
            if (arePermutations(i, 2 * i, 3 * i, 4 * i, 5 * i, 6 *i))
            {
                System.out.println(i);
            }
        }
    }
}
