package problems;

public class Euler85
{

    public static void main(String[] args) {
        /* we need two horizontal sides and two vertical sides to make a rectangle

           in a 3 x 2 rectangle, we see that there are 4 vertical lines and 3 horizontal lines

           this means that there are (4 choose 2) * (3 choose 2) number of rectangles

           so in general, we can see that an m x n grid produces ((m+1) choose 2) * ((n + 1) choose 2) rectangles

           ((m+1) choose 2) * ((n + 1) choose 2) = (m(m+1)/2) * (n(n+1)/2)

            so we just need to find some m and n such that (m(m+1)/2) * (n(n+1)/2) is close to 2 million

            once we find m and n, our solution is simply m * n
        */

        int closest = -1;
        int res = 0;
        for(int m = 0; m < 100; m++)
        {
            for(int n = 0; n < 100; n++)
            {
                int curr = (m*(m+1))/2 * (n*(n+1))/2;

                if(Math.abs(2_000_000 - curr) < Math.abs(2_000_000 - closest))
                {
                    closest = curr;
                    res = m * n;
                }
            }
        }
        System.out.println(res);

    }
}
