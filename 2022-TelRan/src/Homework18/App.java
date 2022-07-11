package Homework18;

public class App {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println(fahrenheit.convert(20));
        Kelvin kelvin = new Kelvin();
        System.out.println(kelvin.convert(20));
        MyTime time1 = new MyTime(0, 0, 0);
        MyTime time2 = new MyTime(0, 0, 1);
        System.out.println(time1.equals(time2));
        System.out.println(time2);
        System.out.println(time1.plus(time2));
        System.out.println(time1.minus(time2));
    }
}
