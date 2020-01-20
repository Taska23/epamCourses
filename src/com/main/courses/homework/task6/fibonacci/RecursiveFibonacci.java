package courses.homework.task6.fibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {

    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of iters");
        int input = scanner.nextInt();
        System.out.println("Fibonacci number at " + input + " position is " + fibonacciRecursion(input));
    }


}
