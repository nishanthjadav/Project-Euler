package problems;

public class Euler36
{
    public static boolean isPalindrome(String s)
    {
        boolean isPal = true;
        for(int i = 0; i < s.length()/2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            {
                isPal = false;
            }
        }
        return isPal;
    }

    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i < 1000000; i++)
        {
            if (isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i)))
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
