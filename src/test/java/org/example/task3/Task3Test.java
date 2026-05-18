package org.example.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    @DisplayName("Задача 3. Вывод нечетных элементов ArrayList")
    void printArrayWithoutEven() {
        Task3.printArrayWithoutEven(Task3.initColorArray());
    }
}