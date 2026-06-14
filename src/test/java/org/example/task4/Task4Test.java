package org.example.task4;

import org.example.Colors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task4Test {

    private static final List<String> colorListWithBlue = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.toString(),
            Colors.RED.toString(),
            Colors.BLUE.toString(),
            Colors.GREEN.toString(),
            Colors.PINK.toString()
    ));

    private static final List<String> colorListWithBlack = new ArrayList<>(Arrays.asList(
            Colors.YELLOW.toString(),
            Colors.RED.toString(),
            Colors.BLUE.toString(),
            Colors.GREEN.toString(),
            Colors.BLACK.toString()
    ));

    @Test
    @DisplayName("Задача 4. Заменить Blue на Black")
    void replaceBlueItem_ifBlackItemNotExist() {
        Task4.replaceBlueItem(colorListWithBlue);
    }

    @Test
    @DisplayName("Задача 4. Не заменять Blue, если уже найден Black")
    void replaceBlueItem_ifBlackItemisExist() {
        Task4.replaceBlueItem(colorListWithBlack);
    }

    @Test
    @DisplayName("Задача 4. Замена произвольного цвета на новый")
    void replaceColorItem_ifBlackItemNotExist() {
        Task4.replaceItem(colorListWithBlue, Colors.RED, Colors.GRAY);
    }
}