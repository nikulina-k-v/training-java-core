package org.example.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    @DisplayName("Задача 1. Вывод ArrayList")
    void printArray() {
        Task1.printArray(Task1.initColorArray());
    }


}