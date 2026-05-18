package org.example.task7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Task7Test {

    @Test
    @DisplayName("Задача 7. Сравнение двух случайных списков")
    void printSortedArrayListWithoutDup() {
        ArrayList<String> firstList = Task7.getRandomColorArrayList();
        ArrayList<String> secondList = Task7.getRandomColorArrayList();

        System.out.println(">>> First list:");
        firstList.forEach(System.out::println);

        System.out.println(">>> Second list:");
        secondList.forEach(System.out::println);

        Task7.printChecksResult(firstList, secondList);
    }

    @Test
    @DisplayName("Задача 7. Одинаковый размер, разные элементы")
    void test1() {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Желтый");
        firstList.add("Красный");
        firstList.add("Белый");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Розовый");
        secondList.add("Голубой");
        secondList.add("Серый");

        Task7.printChecksResult(firstList, secondList);
    }

    @Test
    @DisplayName("Задача 7. Все элементы одного из списков присутствуют во втором списке, вне зависимости от порядка во втором списке (с учетом регистра, white =/= White)")
    void test2() {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Желтый");
        firstList.add("Красный");
        firstList.add("Белый");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Розовый");
        secondList.add("Желтый");
        secondList.add("Красный");
        secondList.add("Белый");
        secondList.add("Голубой");
        secondList.add("Серый");

        Task7.printChecksResult(firstList, secondList);
    }

    @Test
    @DisplayName("Задача 7. Все элементы одного из списков присутствуют во втором списке в том же порядке (сравнение по индексам, учитывая дубликаты)")
    void test3() {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Желтый");
        firstList.add("Красный");
        firstList.add("Белый");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Желтый");
        secondList.add("Красный");
        secondList.add("Белый");

        Task7.printChecksResult(firstList, secondList);
    }
}