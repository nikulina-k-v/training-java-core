package org.example.task7;

import java.util.ArrayList;
import java.util.HashSet;

public class Task7 {
    public static ArrayList<String> initColorArrayOne() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Желтый");
        arrayList.add("Красный");
        arrayList.add("Белый");
        arrayList.add("Зеленый");
        arrayList.add("Черный");
        arrayList.add("Коричневый");
        arrayList.add("Синий");
        arrayList.add("Розовый");
        arrayList.add("Голубой");
        arrayList.add("Серый");

        return arrayList;
    }

    public static ArrayList<String> getRandomColorArrayList() {
        int itemsCount = (int) (Math.random() * 10);
        ArrayList<String> referenceList = initColorArrayOne();
        ArrayList<String> generatedList = new ArrayList<>();

        for (int i = 0; i < itemsCount; i++) {
            generatedList.add(referenceList.get((int) (Math.random() * 9)));
        }

        return generatedList;
    }

    public static void printChecksResult(
            ArrayList<String> firstArrayList,
            ArrayList<String> secondArrayList
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

        if (firstArrayList.equals(secondArrayList)) {
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
}
