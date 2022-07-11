package Homework18;

public class Fahrenheit implements Converter {


    @Override
    public double convert(double celsiusGrad) {
        return (1.8*celsiusGrad)+32;
    }
}
