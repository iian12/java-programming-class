package org.javaro.lecture.a261008;

public class Ex6_8 {
    public static void main(String[] args) {
        double x, y;

        x = 10.0;
        y = 20.0;
        double sub_value = fn_sub(x, y);

        System.out.println("빼기=" + sub_value);
    }

    public static double fn_sub(double x, double y) {
        double result;
        result = x - y;
        return result;
    }
}
