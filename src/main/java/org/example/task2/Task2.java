package org.example.task2;

import java.util.List;

public class Task2 {

    public static void printCropList(List<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > 3) {
                arrayList.set(i, arrayList.get(i).substring(0, 3));
            }

            System.out.println("Index " + i + " :: Element: " + arrayList.get(i));
        }
    }
}
