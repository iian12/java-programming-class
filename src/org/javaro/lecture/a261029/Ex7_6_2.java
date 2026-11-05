package org.javaro.lecture.a261029;

class Dist {
    int x1, y1, x2, y2;

    Dist(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double dLength() {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
}

public class Ex7_6_2 {
    public static void main(String[] args) {
        Dist dist1 = new Dist(10, 30, 20, 60);

        double c = dist1.dLength();

        System.out.println("두 점사이 거리는" + c);

        Dist dist2 = new Dist(15, 35, 55, 65);

        c = dist2.dLength();

        System.out.println("두 점사이 거리는" + c);
    }
}
