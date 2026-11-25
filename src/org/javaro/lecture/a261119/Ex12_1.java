package org.javaro.lecture.a261119;

import java.util.ArrayList;

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
