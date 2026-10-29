package org.javaro.lecture.a261029;

class NameX {
    String name;
    void setName(String nm) {
        this.name = nm;
    }
    String getName() {
        return this.name;
    }
    String getSName() {
        return "이름=" + this.getName();
    }
}
public class Ex7_0 {
    public static void main(String[] args) {
        NameX kdhong = new NameX();
        kdhong.setName("홍길동");
        System.out.println(kdhong.getSName());
    }
}
