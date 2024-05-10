package problems;

public class Euler206
{
    public static void main(String[] args)
    {
        for (long i = 1010101010 ; i <= 1389026623L; i+=10)
        {
            if(String.valueOf(i * i).charAt(0) == '1' && String.valueOf(i * i).charAt(2) == '2' &&
                     String.valueOf(i * i).charAt(4) == '3' && String.valueOf(i * i).charAt(6) == '4' &&
                    String.valueOf(i * i).charAt(8) == '5' && String.valueOf(i * i).charAt(10) == '6' &&
                    String.valueOf(i * i).charAt(12) == '7' && String.valueOf(i * i).charAt(14) == '8' &&
                    String.valueOf(i * i).charAt(16) == '9' && String.valueOf(i * i).charAt(18) == '0')
            {
                System.out.println(i);
                break;
            }
        }





    }
}
