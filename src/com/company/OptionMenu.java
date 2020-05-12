package com.company;

public class OptionMenu {

    public static void optionMenu() {
        System.out.println("Меню с опции");
        System.out.println("1. Сортиране на въведените числа във възходящ ред");
        System.out.println("2. Сортиране на въведените числа във низходящ ред");
        System.out.println("3. Търсене на позиция на конкретно число");
        System.out.println("4. разбъркване на числата");
        System.out.println("5. Изчисляване на сбора на всички числа ");
        System.out.println("6. Намиране на най-голямо число");
        System.out.println("7. Намиране на най-малко число");
        System.out.println("8. Намиране средно аритметично на числата");
        System.out.println("9. Проверка за симетричност на масива от числа");
        System.out.println("10. Обръщане на масива от числа");
        System.out.println("11. Визуализирай въведените числа");
        System.out.println("12. Изход");
        System.out.println("Изберете...");
    }

    public static void optionMenuSC(int[] arr) {

        int count = 0;

        switch (count) {

            case 1:
                MinMax.getMax(arr);
                break;

            case 2:
                MinMax.getMin(arr);
                break;

            case 3:
                BubbleSort.bubbleSortDescending(arr);
                break;

            case 4:
                BubbleSort.bubbleSortAscending(arr);
                break;

            case 5:
                ShuffleArray.shuffleArray(arr);
                break;

            case 6:
                Average.getAverage(arr);
                break;
            case 7:
                SumArray.main(arr);
                break;
        }
    }
}
