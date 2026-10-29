package org.javaro.lecture.a261008;

public class Ex6_10 {
    public static void main(String[] args) {
        double x, y;

        x = 10.0;
        y = 20.0;

        double mult_value = fn_mult(x, y);
        System.out.println("곱하기 = " + mult_value);
    }

    public static double fn_mult(double x, double y) {
        double result;
        result = x * y;
        return result;
    }
}
