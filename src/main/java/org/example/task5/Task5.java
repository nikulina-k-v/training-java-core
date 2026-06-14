package org.example.task5;

import java.util.List;

public class Task5 {

    public static void printArrayListFrom3to7(List<String> arrayList) {
        if (arrayList.size() < 6) {
            throw new IllegalArgumentException("В массиве меньше 7 элементов");
        }
        for (int i = 2; i <= 6; i++) {
            System.out.println("Index " + i + " :: " + "Item: " + arrayList.get(i));
        }
    }
}
