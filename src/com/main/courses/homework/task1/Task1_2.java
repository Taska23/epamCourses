package courses.homework.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Task:
Напишите консольное приложение, которое находит все
совершенные числа в диапазоне от 1 по некоторое заданное положительное
число и выводит их (совершенное число – это число, которое равно сумме
всех своих делителей, кроме самого себя. Например, 6 = 1+2+3).
 */
public class Task1_2 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter some positive integer");
            System.out.println("better to use numbers larger then 10k");
            int inputNumber = scanner.nextInt(); // возможно в это месте(и последующей обработке) следовало-бы использовать что-то вроде "BigInteger" из пакета "java.math"
            if (inputNumber < 0){
                System.err.println("Negative numbers is unsupported");
                return;
            }
            System.out.println("Perfect number at 1 - " + inputNumber +" range is: " + "\n" +  perfectNumberFinder(inputNumber));
        }catch (InputMismatchException e){
            System.err.println("Entered value is unsupported");
        }
    }

    private static String perfectNumberFinder(int inputNumber){
        String result = "";
        for (int i = 1; i <= inputNumber; i++){
            int summary = 0;
            for (int j = 1; j < i; j++){
                if(i % j == 0){
                    summary += j;
                }
            }
            if (summary == i){
                result += i + "\n";

            }
        }
        return result;
    }
}
