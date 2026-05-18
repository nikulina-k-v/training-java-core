package org.example.task6;

import java.util.*;

public class Task6 {
    public static ArrayList<String> initColorArrayOne() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Желтый");
        arrayList.add("Красный");
        arrayList.add("Белый");
        arrayList.add("Зеленый");
        arrayList.add("Черный");

        return arrayList;
    }

    public static ArrayList<String> initColorArrayTwo() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Желтый");
        arrayList.add("Розовый");
        arrayList.add("Голубой");
        arrayList.add("Зеленый");
        arrayList.add("Фуксия");

        return arrayList;
    }

    public static void printSortedArrayListWithoutDup(
            ArrayList<String> firstArrayList,
            ArrayList<String> secondArrayList
            ) {
        Set<String> set = new HashSet<>();
        set.addAll(firstArrayList);
        set.addAll(secondArrayList);

        ArrayList<String> resultArray = new ArrayList<>(set);
        resultArray.sort(Comparator.naturalOrder());
        resultArray.forEach(System.out::println);
    }
}
