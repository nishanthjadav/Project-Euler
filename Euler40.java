package problems;


public class Euler40
{
    public static void main(String[] args)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 1000000; i++)
        {
            result.append(String.valueOf(i));
        }
        System.out.println(result.substring(0, 1));
        System.out.println(result.substring(9, 10));
        System.out.println(result.substring(99, 100));
        System.out.println(result.substring(999, 1000));
        System.out.println(result.substring(9999, 10000));
        System.out.println(result.substring(99999, 100000));
        System.out.println(result.substring(999999, 1000000));

        // multiply above values together for answer


    }
}
