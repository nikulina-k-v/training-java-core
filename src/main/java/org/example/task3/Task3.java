package org.example.task3;

import java.util.ArrayList;

public class Task3 {
    public static ArrayList<String> initColorArray() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Желтый");
        arrayList.add("Красный");
        arrayList.add("Синий");
        arrayList.add("Зеленый");
        arrayList.add("Розовый");
        arrayList.add("Фиолетовый");
        arrayList.add("Голубой");
        arrayList.add("Оранжевый");
        arrayList.add("Фуксия");
        arrayList.add("Черный");

        return arrayList;
    }

    public static void printArrayWithoutEven(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("Index " + i + " :: Element: " + arrayList.get(i));
            }
        }
    }
}
