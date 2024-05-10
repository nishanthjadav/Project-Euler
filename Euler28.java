package problems;

public class Euler28 {
    public static void main(String[] args)
    {
        long sum = 1;
        int cornerValue = 1;
        for (int i = 2; i <= 1001; i += 2) // difference in corner values go 2, 4, 6, 8, etc
        {
            for (int j = 0; j < 4; j++) // 4 corners per ring
            {
                cornerValue += i;
                System.out.println(cornerValue);
                sum += cornerValue;
            }
        }
        System.out.println(sum);
    }
}