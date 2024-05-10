package problems;

public class Euler26
{

    public static void main(String[] args)
    {
        int maxLength = 0;
        int number = 0;

        for (int i = 1000; i > 1; i--)
        {
            int[] remainders = new int[i];
            int value = 1;
            int position = 0;

            while (remainders[value] == 0 && value != 0)
            {
                // Keep track of the position where the remainder occurred
                remainders[value] = position;
                value *= 10;
                value %= i;
                position++;
            }

            if (position - remainders[value] > maxLength)
            {
                maxLength = position - remainders[value];
                number = i;
            }
        }

        System.out.println("Number with longest recurring cycle: " + number);
    }
}
