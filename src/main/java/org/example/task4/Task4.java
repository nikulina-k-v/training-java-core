package org.example.task4;

import org.example.Colors;

import java.util.List;

public class Task4 {

    public static void replaceBlueItem(List<String> arrayList) {

        if (arrayList.contains(Colors.BLACK.toString())) {
            System.out.println("Black уже есть под индексом " + arrayList.indexOf(Colors.BLACK.toString()) + "!");
            arrayList.forEach(System.out::println);
        } else {
            arrayList.set(arrayList.indexOf(Colors.BLUE.toString()), Colors.BLACK.toString());
            arrayList.forEach(System.out::println);
        }
    }

    public static void replaceItem(List<String> arrayList, Colors targetColor, Colors newColor) {

        if (arrayList.contains(newColor.toString())) {
            System.out.println("Новый цвет уже есть под индексом " + arrayList.indexOf(targetColor.toString()) + "!");
            arrayList.forEach(System.out::println);
        } else {
            do {
                arrayList.set(arrayList.indexOf(targetColor.toString()), newColor.toString());
            } while (arrayList.contains(targetColor.toString()));
            arrayList.forEach(System.out::println);
        }
    }
}
