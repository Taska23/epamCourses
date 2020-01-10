package courses.homework.task1;

import java.util.Scanner;

/*
Task:
Напишите консольное приложение, которое выполняет поворот
квадратной матрицы размерностью N на 90° против часовой стрелки.
 */
public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some positive integer, it will be matrix order");
        System.out.println("Better to use numbers from 1 to 9");
        int inputNumber = scanner.nextInt();
        if (inputNumber>9){
            System.out.println("Warning: Entered number is bigger than 9");
        }
        if (inputNumber < 0){
            System.err.println("Negative numbers is unsupported");
            return;
        }
    matrixSpinner(inputNumber);
    }

    private static int[][] matrixSpinner(int inputNumber){
        int [][] sourceMatrix = new int[inputNumber][inputNumber];
        int [][] resultMatrix= new int[inputNumber][inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j < inputNumber; j++) {
                sourceMatrix[i][j] = (int)(Math.random() * 100) ;

            }
        }
        System.out.println("Matrix with order of " + inputNumber + " numbers generated: \n");
        for (int i = 0; i < inputNumber; i++ ){
            for (int j = 0; j < inputNumber; j++) {
                System.out.print(sourceMatrix[i][j] + " ");

            }
            System.out.print("\n");
        }

        System.out.println("\n Turning matrix 90° counterclock-wise... \n");

        for (int j = 0; j < inputNumber; j++) {
            for (int i = 0; i < inputNumber; i++) {
                resultMatrix[i][j] = sourceMatrix[j][inputNumber-i-1] ;

            }
        }

        for (int i = 0; i < inputNumber; i++ ){
            for (int j = 0; j < inputNumber; j++) {
                System.out.print(resultMatrix[i][j] + " ");

            }
            System.out.print("\n");
        }


        return resultMatrix;
    }
}
