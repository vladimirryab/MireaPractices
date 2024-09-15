package ru.mirea.lab4;

public enum Season {
    SPRING("Весна", "Теплое время года. Тепло, цветы, птицы поют, природа просыпается", 10),
    SUMMER("Лето", "Жаркое время года. Жара, солнце, купание, отпуск", 25),
    AUTUMN("Осень", "Красивое время года. Золотая листва, урожай, прохлада, подготовка к зиме", 15),
    WINTER("Зима", "Холодное время года. Снег, Новый Год, праздники, холод", -5);

    private final String name;
    private final String description;
    private final int averageTemp;

    Season(String name, String description, int averageTemp) {
        this.name = name;
        this.description = description;
        this.averageTemp = averageTemp;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            Season favoriteSeason = Season.SUMMER;
            switch (i) {
                case 0:
                    favoriteSeason = Season.SPRING;
                    break;
                case 1:
                    favoriteSeason = Season.SUMMER;
                    break;
                case 2:
                    favoriteSeason = Season.AUTUMN;
                    break;
                case 3:
                    favoriteSeason = Season.WINTER;
                    break;
            }
            System.out.println("Мое любимое время года: " + favoriteSeason.getName());
            System.out.println("Описание: " + favoriteSeason.getDescription());
            System.out.println("Средняя температура: " + favoriteSeason.getAverageTemp() + " градусов");
        }
    }
}