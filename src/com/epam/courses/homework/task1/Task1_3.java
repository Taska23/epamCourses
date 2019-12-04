package com.epam.courses.homework.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Напишите консольное приложение, которое вызывает метод для
построения пирамиды высотой в диапазоне от 1 по 9. Например, для высоты
= 4:

   1
  121
 12321
1234321
 */
public class Task1_3 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Let`s build the pyramid");
            System.out.println("Enter some positive integer, it will be height of pyramid");
            System.out.println("Better to use numbers from 1 to 9");
            int inputNumber = scanner.nextInt();
            if (inputNumber>9){
                System.out.println("Warning: Entered number is bigger than 9");
            }
            if (inputNumber < 0){
                System.err.println("Negative numbers is unsupported");
                return;
            }

            pyramidBuilder(inputNumber);

        }catch (InputMismatchException e){
            System.err.println("Entered value is unsupported");
        }

    }

    private static void pyramidBuilder(int height){
        String result = "";

        for(int i = 1; i <= height; i++){
            for (int j = height-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
