package org.javaro.lecture.a261008;

public class Hw4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("1부터 100까지의 합: " + sum);
    }
}
