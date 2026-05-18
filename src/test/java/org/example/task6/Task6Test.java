package org.example.task6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task6Test {

    @Test
    @DisplayName("Задача 6. Объединить, отсортировать, удалить дубликаты")
    void printSortedArrayListWithoutDup() {
        Task6.printSortedArrayListWithoutDup(Task6.initColorArrayOne(), Task6.initColorArrayTwo());
    }
}