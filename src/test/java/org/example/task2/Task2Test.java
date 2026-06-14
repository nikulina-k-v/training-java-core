package org.example.task2;

import org.example.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task2Test {

    private static final List<String> colorList = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.getRussianName(),
            Colors.RED.getRussianName(),
            Colors.BLUE.getRussianName(),
            Colors.GREEN.getRussianName(),
            Colors.PINK.getRussianName()
    ));

    @Test
    @DisplayName("Задача 2. Вывод ArrayList с сокращением длины элементов до трех символов")
    void printCropList() {
        Task2.printCropList(colorList);
    }
}