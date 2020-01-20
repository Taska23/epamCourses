package courses.practice.lesson01;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Rule


    @Test
    public void calcShouldReturnSumWhen1Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(1,"+",2);
        final int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    public void calcShouldReturnSumWhen3Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(3,"+",2);
        final int expected = 5;

        assertEquals(expected,actual);
    }

    @Test
    public void calcShouldReturnMinusWhen3Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(3,"-",2);
        final int expected = 1;

        assertEquals(expected,actual);
    }
    @Test
    public void calcShouldReturnDevideWhen10Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(10,"/",2);
        final int expected = 5;

        assertEquals(expected,actual);
    }
    @Test
    public void calcShouldReturnDevideWhen4Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(4,"/",2);
        final int expected = 2;

        assertEquals(expected,actual);
    }
    @Test
    public void calcShouldReturnDevideWhen5Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(5,"/",2);
        final int expected = 2;

        assertEquals(expected,actual);
    }
    @Test
    public void calcShouldReturnMultiplyWhen10Plus2(){
        Calculator calculator = new Calculator();
        final int actual = calculator.calc(10,"*",2);
        final int expected = 20;

        assertEquals(expected,actual);
    }
    @Test
    public void calcShouldThrowIllegalArgumentExeptionWhenOperatorIsNull (){

        Calculator calculator = new Calculator();
        calculator.calc(1,null,3);


    }

}