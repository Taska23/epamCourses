package com.epam.courses.homework.task3.task3_1.model;

import com.epam.courses.homework.task3.task3_1.model.entity.AbstractToy;
import java.util.Arrays;
import java.util.Comparator;

public class PlayingRoom <E extends AbstractToy> {
    private static final  int DEFAULT_CAPACITY = 10;
    private E[] box;
    private int size=0;
    private int capacity;

    public PlayingRoom(int capacity) {
        this.capacity = capacity;
        box = (E[]) new AbstractToy[capacity];
    }

    public PlayingRoom() {
        this(DEFAULT_CAPACITY);
    }

    public boolean addToy(E toy){
        if(capacity==size){
            increaseCapacity();
        }
        box[size++] = toy;
        return true;
    }

    public int getBoxSize(){
        return this.size;
    }

    public E[] sort(Comparator<? super E> comparator){
        E[] boxCopy = trimToSize(box);
        Arrays.sort(boxCopy,comparator);
        return boxCopy;
    }

    public int getGeneralToysPrice(){
        int sum =0;
        for (E elem : box) {
            if(elem!=null)sum = sum+elem.getPrice();
        }
        return sum;
    }

    public E[] getToysByParameters(int price, int age, String gender){
        int selectionIndex = 0;
        E[] selectionList = (E[]) new AbstractToy[box.length];
        for (E elem : box) {
            if(elem!=null && elem.getPrice()<=price && elem.getGender().equals(gender) && elem.getAge()<=age) selectionList[selectionIndex++]= elem;
        }
        return trimToSize(selectionList);
    }

    public E[] getToysArray(){
        return trimToSize(box);
    }

    private E[] trimToSize(E[] array) {
        int valuesIndex = 0;
        for (E elem:array) {
            if (elem!=null){
                valuesIndex++;
            }else {
                break;
            }
        }
        return  Arrays.copyOf(array, valuesIndex);
    }

    private void increaseCapacity(){
        int oldCapacity = size;
        capacity = oldCapacity + (oldCapacity >> 1);
        box = Arrays.copyOf(box, capacity);
    }

}
