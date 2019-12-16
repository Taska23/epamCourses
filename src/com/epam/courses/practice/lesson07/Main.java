package com.epam.courses.practice.lesson07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
//            switch(day) {
//                case FRIDAY:case MONDAY:case WEDNESDAY:
//                    System.out.println(day);
//            }
//
            if(day.isFlag()){
                System.out.println(day);
            }
        }

        System.out.println("-----------------------");
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter day of week -> ");
        System.out.println("Next day -> " + DaysOfWeek.valueOf(scanner.next().toUpperCase()).nextDay());

    }
}
