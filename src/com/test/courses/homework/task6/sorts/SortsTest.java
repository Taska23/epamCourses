package courses.homework.task6.sorts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortsTest {

    @Test
    public void bubleSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.bubleSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void selectionSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.selectionSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.insertionSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shuttleSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.shuttleSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shellSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.shellSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }


    public void mergeSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.mergeSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void countingSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.countingSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void quickSort() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.quickSort(array);
        final int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void getMaxNumber() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int actual = sorts.getMaxNumber(array);
        final int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    public void swap() {
        Sorts sorts = new Sorts();
        int[] array = {10,1,3,5,7,6,8,9,0,2,4,6,6,6,1,2,3,4,0};
        final int[] actual = sorts.swap(array,3,5);
        final int[] expected = {10,1,3,6,7,5,8,9,0,2,4,6,6,6,1,2,3,4,0};
        assertArrayEquals(expected,actual);
    }
}