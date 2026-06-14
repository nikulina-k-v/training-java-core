package org.example.task1;

import java.util.List;

public class Task1 {

    public static void printList(List<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index " + i + " :: Element: " + arrayList.get(i));
        }
    }
}
