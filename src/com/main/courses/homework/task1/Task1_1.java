package courses.homework.task1;
/*
Task:
Напишите консольное приложение, которое определяет целое
положительное число в десятичной системе, затем преобразует в
двоичной/восьмиричной/шестнадцатиричной системах счисления и выводит
результат.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the some integer number");
            System.out.println("It will be converted to Binary, Octal and Hexidecimal numbers");
            int inputNumber = scanner.nextInt();
            System.out.println("Binary system: " + binaryConvertor(inputNumber));
            System.out.println("Octal system: " + octalConvertor(inputNumber));
            System.out.println("Hexidecimal system: " + hexidecimalConvertor(inputNumber));
        }catch (InputMismatchException e){
            System.err.println("Entered value is unsupported");
        }
    }

    private static String binaryConvertor(int inputNumber){
        String result = "";
        int tempNumber;
        while(inputNumber !=0 ) {
            tempNumber = inputNumber%2;
            result += tempNumber;
            inputNumber = inputNumber/2;
        }
        result = new StringBuffer(result).reverse().toString();
        return result;
    }

    private static String octalConvertor(int inputNumber){
        String result = "";
        int tempNumber;
        while(inputNumber !=0 ) {
            tempNumber = inputNumber%8;
            result += tempNumber;
            inputNumber = inputNumber/8;
        }
        result = new StringBuffer(result).reverse().toString();
        return result;
    }

    private static String hexidecimalConvertor(int inputNumber){
        String result = "";
        int tempNumber;
        while(inputNumber !=0 ) {
            tempNumber = inputNumber%16;
            if (tempNumber<9){
            result += tempNumber;
            }else switch (tempNumber){
                case (10):
                    result += "A";
                    break;
                case (11):
                    result += "B";
                    break;
                case (12):
                    result += "C";
                    break;
                case (13):
                    result += "D";
                    break;
                case (14):
                    result += "E";
                    break;
                case (15):
                    result += "F";
                    break;

            }
            inputNumber = inputNumber/16;
        }
        result = new StringBuffer(result).reverse().toString();
        return result;
    }

}
