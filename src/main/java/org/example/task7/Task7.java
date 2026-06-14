package org.example.task7;

import java.util.HashSet;
import java.util.List;

public class Task7 {


    public static void printChecksResult(
            List<String> firstArrayList,
            List<String> secondArrayList
    ) {
        boolean sizeCheck = false;
        boolean objectsEqualsWithoutOrderCheck = false;
        boolean fullItemEqualsWithOrderCheck = false;

        if (firstArrayList.size() == secondArrayList.size()) {
            sizeCheck = true;
        }

        if (new HashSet<>(secondArrayList).containsAll(new HashSet<>(firstArrayList))) {
            objectsEqualsWithoutOrderCheck = true;
        }

        if (isEquals(firstArrayList, secondArrayList)) {
            fullItemEqualsWithOrderCheck = true;
        }

        if (sizeCheck && objectsEqualsWithoutOrderCheck && fullItemEqualsWithOrderCheck) {
            System.out.println("Списки совпадают!");
        } else {
            if (!sizeCheck) {
                System.out.println("Первая проверка провалена");
            }
            if (!objectsEqualsWithoutOrderCheck) {
                System.out.println("Вторая проверка провалена");
            }
            if (!fullItemEqualsWithOrderCheck) {
                System.out.println("Третья проверка провалена");
            }
        }
    }

    private static boolean isEquals(List<String> firstList, List<String> secondList) {

        if(firstList.size() != secondList.size()) {
            return false;
        }

        for(int i = 0; i < firstList.size(); i++) {
            if(!firstList.get(i).equals(secondList.get(i))) {
                return false;
            }
        }

        return true;
    }
}
