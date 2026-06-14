package org.example.task3;

import java.util.List;

public class Task3 {

    public static void printListWithoutEven(List<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("Index " + i + " :: Element: " + arrayList.get(i));
            }
        }
    }
}
