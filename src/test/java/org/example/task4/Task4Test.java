package org.example.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task4Test {

    @Test
    @DisplayName("Задача 4. Заменить Blue на Black")
    void replaceBlueItem_ifBlackItemNotExist() {
        Task4.replaceBlueItem(Task4.initColorArrayWithBlue());
    }

    @Test
    @DisplayName("Задача 4. Не заменять Blue, если уже найден Black")
    void replaceBlueItem_ifBlackItemisExist() {
        Task4.replaceBlueItem(Task4.initColorArrayWithBlack());
    }
}