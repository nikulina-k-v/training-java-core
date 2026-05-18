package org.example.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    @DisplayName("Задача 2. Вывод ArrayList с сокращением длины элементов до трех символов")
    void printCropArray() {
        Task2.printCropArray(Task2.initColorArray());
    }
}