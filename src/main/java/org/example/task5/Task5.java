package org.example.task5;

import java.util.ArrayList;

public class Task5 {
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

    public static void printArrayListFrom3to7(ArrayList<String> arrayList) {
        if (arrayList.size() < 6) {
            throw new IllegalArgumentException("В массиве меньше 7 элементов");
        }
        for (int i = 2; i <= 6; i++) {
            System.out.println("Index " + i + " :: " + "Item: " + arrayList.get(i));
        }
    }
}
