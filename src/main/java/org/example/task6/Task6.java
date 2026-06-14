package org.example.task6;

import java.util.*;

public class Task6 {

    public static void printSortedArrayListWithoutDup(
            List<String> firstArrayList,
            List<String> secondArrayList
    ) {
        Set<String> set = new HashSet<>();
        set.addAll(firstArrayList);
        set.addAll(secondArrayList);

        List<String> resultArrayList = new ArrayList<>(set);
        resultArrayList.sort(Comparator.naturalOrder());
        resultArrayList.forEach(System.out::println);
    }
}
