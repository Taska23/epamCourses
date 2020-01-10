package courses.homework.task4;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TemperatureConverterTest {

    private TemperatureConverter temperatureConverter;

    @Parameterized.Parameter(0)
    public double celsius;
    @Parameterized.Parameter(1)
    public double kelvin;
    @Parameterized.Parameter(2)
    public double fahrenheit;

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(
                new Object[][]{
                        //C -> K -> F
                        {0.0, 273.2, 32.0},
                        {-273.0, 0.0, -459.4},
                        {3.0, 276.2, 37.4},
                        {-5.0, 268.2, 23.0}
                }
        );
    }


    @Before
    public void init(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void convertFtoC() {
        double fahrenheitToCelsius = temperatureConverter.convertFtoC(fahrenheit);
        assertEquals(celsius, fahrenheitToCelsius, 0.2);
    }

    @Test
    public void convertCtoF() {
        double celsiusToFahrenheit = temperatureConverter.convertCtoF(celsius);
        assertEquals(fahrenheit, celsiusToFahrenheit,0.2);
    }

    @Test
    public void convertCtoK() {
        double celsiusToKelvin = temperatureConverter.convertCtoK(celsius);
        Assert.assertEquals(kelvin, celsiusToKelvin, 0.2);
    }

    @Test
    public void convertKtoC() {
        double kelvinToCelsius = temperatureConverter.convertKtoC(kelvin);
        assertEquals(celsius, kelvinToCelsius, 0.2);
    }

    @Test
    public void convertFtoK() {
        double fahrenheitToKelvin = temperatureConverter.convertFtoK(fahrenheit);
        assertEquals(kelvin,fahrenheitToKelvin,0.2);
    }

    @Test
    public void convertKtoF() {
        double kelvinToFahrenheit = temperatureConverter.convertKtoF(kelvin);
        assertEquals(fahrenheit,kelvinToFahrenheit,0.6);
    }
}