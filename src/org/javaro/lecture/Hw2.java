package org.javaro.lecture;

public class Hw2 {
    public static void main(String[] args) {
        int secondVar = 1000;
        int minOut = secondVar / 60;
        int secondOut = secondVar % 60;

        System.out.println("분(minute) : " + minOut);
        System.out.println("초(second) : " + secondOut);
    }
}
