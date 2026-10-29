package org.javaro.lecture.a261029;

class Studentx {
    String studNo, name;
    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudNo() {
        return this.studNo;
    }

    public String getName() {
        return this.name;
    }
}

public class Ex7_11 {
    public static void main(String[] args) {
        Studentx stud1 = new Studentx();
        stud1.setStudNo("20xx1234");
        stud1.setName("홍길동");
        System.out.println(stud1.getStudNo());
        System.out.println(stud1.getName());
    }
}
