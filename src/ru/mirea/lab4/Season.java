package ru.mirea.lab4;

public enum Season {
    SPRING("Весна", "Тепло, цветы, птицы поют, природа просыпается"),
    SUMMER("Лето", "Жара, солнце, купание, отпуск"),
    AUTUMN("Осень", "Золотая листва, урожай, прохлада, подготовка к зиме"),
    WINTER("Зима", "Снег, Новый Год, праздники, холод");

    private final String name;
    private final String description;

    Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {

        Season favoriteSeason = Season.SUMMER;

        System.out.println("Мое любимое время года: " + favoriteSeason.getName());
        System.out.println("Описание: " + favoriteSeason.getDescription());
    }
}