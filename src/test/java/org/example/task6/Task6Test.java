package org.example.task6;

import org.example.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task6Test {

    private static final List<String> colorListOne = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.getRussianName(),
            Colors.RED.getRussianName(),
            Colors.WHITE.getRussianName(),
            Colors.GREEN.getRussianName(),
            Colors.BLACK.getRussianName()
    ));

    private static final List<String> colorListTwo = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.getRussianName(),
            Colors.PINK.getRussianName(),
            Colors.LIGHT_BLUE.getRussianName(),
            Colors.GREEN.getRussianName(),
            Colors.FUCHSIA.getRussianName()
    ));

    @Test
    @DisplayName("Задача 6. Объединить, отсортировать, удалить дубликаты")
    void printSortedArrayListWithoutDup() {
        Task6.printSortedArrayListWithoutDup(colorListOne, colorListTwo);
    }
}