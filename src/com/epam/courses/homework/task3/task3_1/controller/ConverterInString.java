package com.epam.courses.homework.task3.task3_1.controller;



class ConverterInString {

    static <E> String convertArray(E[] array){
        String result = "";
        for (E elem:array) {
            result+=elem.toString();
        }
        return result;

    }

}
