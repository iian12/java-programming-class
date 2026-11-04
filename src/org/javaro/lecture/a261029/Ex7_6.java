package org.javaro.lecture.a261029;

class Vadd6 {
    private double x, y;

    void setX(double x) {
        this.x = x;
    }

    double getX() {
        return this.x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getY() {
        return this.y;
    }

    public double fn_add() {
        return this.x + this.y;
    }
}

public class Ex7_6 {
    public static void main(String[] args) {
        Vadd6 add1 = new Vadd6();
        add1.setX(10.0);
        add1.setY(20.0);
        double add_value = add1.fn_add();
        System.out.println("더하기=" + add_value);
    }
}
