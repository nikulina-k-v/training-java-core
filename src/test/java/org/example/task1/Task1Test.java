package org.example.task1;

import org.example.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task1Test {

    private static final List<String> colorArray = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.getRussianName(),
            Colors.RED.getRussianName(),
            Colors.BLUE.getRussianName(),
            Colors.GREEN.getRussianName(),
            Colors.PINK.getRussianName()
    ));

    @Test
    @DisplayName("Задача 1. Вывод ArrayList")
    void printList() {
        Task1.printList(colorArray);
    }
}