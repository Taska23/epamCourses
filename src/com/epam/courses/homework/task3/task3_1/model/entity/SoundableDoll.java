package com.epam.courses.homework.task3.task3_1.model.entity;


import com.epam.courses.homework.task3.task3_1.model.interfaces.Soundable;

public class SoundableDoll implements Soundable {
    @Override
    public void sound() {
        System.out.println("Doll sound");
    }
}
