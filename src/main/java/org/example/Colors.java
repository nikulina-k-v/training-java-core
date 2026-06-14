package org.example;

public enum Colors {

    YELLOW("Желтый"),
    RED("Красный"),
    WHITE("Белый"),
    GREEN("Зеленый"),
    BLACK("Черный"),
    BROWN("Коричневый"),
    BLUE("Синий"),
    PINK("Розовый"),
    LIGHT_BLUE("Голубой"),
    FUCHSIA("Фуксия"),
    GRAY("Серый"),
    ORANGE("Оранжевый"),
    VIOLET("Фиолетовый");

    Colors(String russianName) {
        this.russianName = russianName;
    }

    private final String russianName;

    public String getRussianName() {
        return russianName;
    }

    /**
     * Возвращает элемент enum по русскому названию цвета.
     * @param russianName строка с русским названием (например, "Желтый")
     * @return соответствующий Color или выбрасывает исключение, если не найдено
     */
    public static Colors fromRussianName(String russianName) {
        for (Colors color : values()) {
            if (color.russianName.equalsIgnoreCase(russianName)) {
                return color;
            }
        }
        throw new IllegalArgumentException("Неизвестный цвет: " + russianName);
    }
}
