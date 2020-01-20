package courses.homework.task6.factorial;

import java.math.BigInteger;
import java.util.Scanner;

class Factorial
{
    public static void main (String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n).toString());
    }

    public static BigInteger factorial(int n)
    {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
