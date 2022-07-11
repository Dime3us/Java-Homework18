package Homework18;

import java.beans.JavaBean;

public class MyTime {
    int hour;
    int minute;
    int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return hour + " hours " + minute + " minutes " + second + " seconds ";
    }

    public boolean equals(MyTime a) {
        return getHour() == a.getHour() && getMinute() == a.getMinute() && getSecond() == a.getSecond();

    }

    public MyTime plus(MyTime a) {
        int newHour = 0;
        int newMinute = 0;
        int newSecond = 0;
        newSecond = getSecond() + a.getSecond();
        if (newSecond > 59) {
            newMinute = 1;

            newSecond = newSecond - 60;
        }
        newMinute = getMinute() + a.getMinute() + newMinute;

        if (newMinute > 59) {
            newHour = 1;
            newMinute = newMinute - 60;
        }

        newHour = getHour() + a.getHour() + newHour;

        return new MyTime(newHour, newMinute, newSecond);
    }

    public MyTime minus(MyTime a) {
        int newHour = 0;
        int newMinute = 0;
        int newSecond = 0;


        newSecond = getSecond() - a.getSecond();

        newMinute = getMinute() - a.getMinute();

        newHour = getHour() - a.getHour();

        if (newSecond < 0) {
            newSecond = 60 + newSecond;
            newMinute--;
        }
        if (newMinute < 0) {
            newMinute = 60 + newMinute;
            newHour--;
        }
        if (newHour < 0) {
            return null;
        }

        return new MyTime(newHour, newMinute, newSecond);
    }
}