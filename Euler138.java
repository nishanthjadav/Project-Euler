package problems;

public class Euler138
{
    public static void main(String[] args)
    {

//        long sum = 0;
//        int count = 1;
//        for (long l = 1; count <= 12; l++)
//        {
//            for (long b = 2; b < l; b+=2)
//            {
//                long halfB = b / 2;
//                double h = Math.sqrt(l * l - halfB * halfB);
//                if (h == b - 1 || h == b + 1 && (halfB * halfB + h * h == l * l))
//                {
//                    sum += l;
//
//                    System.out.println("#" + count + ": " + "b: " + b + ", L: " + l + ", h: " + h + ", Current sum: " + sum);
//                    count++;
//                }
//            }
//        }
//        System.out.println(sum);
        // BRUTE FORCED, FOUND PATTERN:
// #1: b: 16, L: 17, h: 15.0, Current sum: 17
// #2: b: 272, L: 305, h: 273.0, Current sum: 322
// #3: b: 4896, L: 5473, h: 4895.0, Current sum: 5795
// #4: b: 87840, L: 98209, h: 87841.0, Current sum: 104004

        // 305 = 17 * 18 - 1
        // 5473 = 305 * 18 - 17
        // 98209 = 5473 * 18 - 305
        // x4 = 98209 * 18 - 5473
        long t1 = 17;
        long t2 = 305;
        long next;
        long sum = 0;
        for (int i = 1; i <= 12; i++)
        {
            System.out.println("#" + i + ": " + t1);
            sum += t1;
            next = t2 * 18 - t1;
            t1 = t2;
            t2 = next;
        }
        System.out.println(sum);
    }
}
