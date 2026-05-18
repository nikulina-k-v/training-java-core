package org.example.task1;


import java.util.ArrayList;

public class Task1 {

    public static ArrayList<String> initColorArray() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Желтый");
        arrayList.add("Красный");
        arrayList.add("Синий");
        arrayList.add("Зеленый");
        arrayList.add("Розовый");

        return arrayList;
    }

    public static void printArray(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index " + i + " :: Element: " + arrayList.get(i));
        }
    }
}
