package org.example.task5;

import org.example.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task5Test {

    private static final List<String> colorList = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.getRussianName(),
            Colors.RED.getRussianName(),
            Colors.BLUE.getRussianName(),
            Colors.GREEN.getRussianName(),
            Colors.PINK.getRussianName(),
            Colors.VIOLET.getRussianName(),
            Colors.LIGHT_BLUE.getRussianName(),
            Colors.ORANGE.getRussianName(),
            Colors.FUCHSIA.getRussianName(),
            Colors.BLACK.getRussianName()
    ));

    @Test
    @DisplayName("Задача 5. Вывести элементы с 3 по 7 включительно")
    void printArrayListFrom3to7() {
        Task5.printArrayListFrom3to7(colorList);
    }
}