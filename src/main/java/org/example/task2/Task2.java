package org.example.task2;

import java.util.ArrayList;

public class Task2 {

    public static ArrayList<String> initColorArray() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Желтый");
        arrayList.add("Красный");
        arrayList.add("Синий");
        arrayList.add("Зеленый");
        arrayList.add("Розовый");

        return arrayList;
    }

    public static void printCropArray(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > 3) {
                arrayList.set(i, arrayList.get(i).substring(0, 3));
            }

            System.out.println("Index " + i + " :: Element: " + arrayList.get(i));
        }
    }
}
