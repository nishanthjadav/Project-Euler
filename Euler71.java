package problems;
import java.util.function.*;
import java.util.TreeMap;

import static problems.MyFunctions.*;

public class Euler71
{

    public static void main(String[] args)
    {
        int limit = 1000000;
        TreeMap<Double, String> fractions = new TreeMap<>();

        for (int d = 2; d <= limit; d++)
        {
            int n = (int) (d * 3 / 7.0);
            // lines 19-20 were added to test out built in functional interfaces
            BinaryOperator<Integer> gcdCalc = MyFunctions::gcd;
            int gcd = gcdCalc.apply(n, d);
            int reducedN = n / gcd;
            int reducedD = d / gcd;
            fractions.put((double) reducedN / reducedD, reducedN + " / " + reducedD);
        }
        for (Double key : fractions.keySet())
        {
            System.out.println(key + " = " + fractions.get(key));
        }

    }
}
