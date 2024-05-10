package problems;
import java.util.ArrayList;
import java.util.Collections;

public class Euler62
{
    public static boolean arePermutations(long num1, long num2)
    {
        ArrayList<Long> n1 = new ArrayList<>();
        ArrayList<Long> n2 = new ArrayList<>();
        while (num1 >= 1)
        {
            n1.add(num1 % 10);
            num1 /= 10;
        }
        while (num2 >= 1)
        {
            n2.add(num2 % 10);
            num2 /= 10;
        }
        Collections.sort(n1);
        Collections.sort(n2);
        return n1.equals(n2);
    }
    public static void main(String[] args)
    {
        ArrayList<Long> cubes = new ArrayList<>();
        for (int i = 1; i <= 10000; i++)
        {
            System.out.println(i);
            long iVal = (long)Math.pow(i, 3);
            for (int j = 1; j < i; j++)
            {
                long jVal = (long)Math.pow(j, 3);
                if (arePermutations(iVal, jVal))
                {
                    //System.out.println(i +"^3 is permutations with " + j + "^3");
                    cubes.add(iVal);
                    cubes.add(jVal);
                }
            }
        }
        Collections.sort(cubes);
        //System.out.println(cubes);
        ArrayList<Long> finals = new ArrayList<>();
        for (long i : cubes)
        {
            for (long j : cubes)
            {
                if (arePermutations(i, j) && i != j)
                {
                    //System.out.println(i + ", " + j);
                    finals.add(i);
                    finals.add(j);
                }
            }
        }
        for (long f : finals)
        {
            int s = Collections.frequency(finals, f);
            if (s >= 16)
            {
                System.out.println(f + ": " + s);
            }
        }
    }
}
