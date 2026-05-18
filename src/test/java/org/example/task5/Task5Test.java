package org.example.task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task5Test {

    @Test
    @DisplayName("Задача 5. Вывести элементы с 3 по 7 включительно")
    void printArrayListFrom3to7() {
        Task5.printArrayListFrom3to7(Task5.initColorArray());
    }
}