package org.example.task7;

import org.example.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task7Test {

    private static final List<String> referenceList = new ArrayList<>(Arrays.asList(
        Colors.YELLOW.getRussianName(),
        Colors.RED.getRussianName(),
        Colors.WHITE.getRussianName(),
        Colors.GREEN.getRussianName(),
        Colors.BLACK.getRussianName(),
        Colors.BROWN.getRussianName(),
        Colors.BLUE.getRussianName(),
        Colors.PINK.getRussianName(),
        Colors.LIGHT_BLUE.getRussianName(),
        Colors.GRAY.getRussianName()
    ));

    private static List<String> getRandomColorArrayList() {
        int itemsCount = (int) (Math.random() * 10);
        ArrayList<String> generatedList = new ArrayList<>();

        for (int i = 0; i < itemsCount; i++) {
            generatedList.add(referenceList.get((int) (Math.random() * 9)));
        }

        return generatedList;
    }

    @Test
    @DisplayName("Задача 7. Сравнение двух случайных списков")
    void printSortedArrayListWithoutDup() {
        List<String> firstList = getRandomColorArrayList();
        List<String> secondList = getRandomColorArrayList();

        System.out.println(">>> First list:");
        firstList.forEach(System.out::println);

        System.out.println(">>> Second list:");
        secondList.forEach(System.out::println);

        Task7.printChecksResult(firstList, secondList);
    }

    @Test
    @DisplayName("Задача 7. Одинаковый размер, разные элементы")
    void test1() {
        List<String> firstList = new ArrayList<>();
        firstList.add(Colors.YELLOW.getRussianName());
        firstList.add(Colors.RED.getRussianName());
        firstList.add(Colors.WHITE.getRussianName());

        List<String> secondList = new ArrayList<>();
        secondList.add(Colors.PINK.getRussianName());
        secondList.add(Colors.LIGHT_BLUE.getRussianName());
        secondList.add(Colors.GRAY.getRussianName());

        Task7.printChecksResult(firstList, secondList);
    }

    @Test
    @DisplayName("Задача 7. Все элементы одного из списков присутствуют во втором списке, вне зависимости от порядка во втором списке (с учетом регистра, white =/= White)")
    void test2() {
        List<String> firstList = new ArrayList<>();
        firstList.add(Colors.YELLOW.getRussianName());
        firstList.add(Colors.RED.getRussianName());
        firstList.add(Colors.WHITE.getRussianName());

        List<String> secondList = new ArrayList<>();
        secondList.add(Colors.PINK.getRussianName());
        secondList.add(Colors.YELLOW.getRussianName());
        secondList.add(Colors.RED.getRussianName());
        secondList.add(Colors.WHITE.getRussianName());
        secondList.add(Colors.LIGHT_BLUE.getRussianName());
        secondList.add(Colors.GRAY.getRussianName());

        Task7.printChecksResult(firstList, secondList);
    }

    @Test
    @DisplayName("Задача 7. Все элементы одного из списков присутствуют во втором списке в том же порядке (сравнение по индексам, учитывая дубликаты)")
    void test3() {
        List<String> firstList = new ArrayList<>();
        firstList.add(Colors.YELLOW.getRussianName());
        firstList.add(Colors.RED.getRussianName());
        firstList.add(Colors.WHITE.getRussianName());

        List<String> secondList = new ArrayList<>();
        secondList.add(Colors.YELLOW.getRussianName());
        secondList.add(Colors.RED.getRussianName());
        secondList.add(Colors.WHITE.getRussianName());

        Task7.printChecksResult(firstList, secondList);
    }
}