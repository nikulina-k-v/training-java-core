package org.example.task4;

import java.util.ArrayList;

public class Task4 {
    public static ArrayList<String> initColorArrayWithBlue() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yellow");
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Pink");

        return arrayList;
    }

    public static ArrayList<String> initColorArrayWithBlack() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yellow");
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Black");

        return arrayList;
    }

    public static void replaceBlueItem(ArrayList<String> arrayList) {

        if (arrayList.contains("Black")) {
            System.out.println("Black уже есть под индексом " + arrayList.indexOf("Black") + "!");
            arrayList.forEach(System.out::println);
        } else {
            arrayList.set(arrayList.indexOf("Blue"), "Black");
            arrayList.forEach(System.out::println);
        }
    }
}
