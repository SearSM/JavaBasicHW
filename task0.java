// Формат сдачи: ссылка на подписанный git-проект.

// Задание

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

import java.util.*;

public class task0 {
    public static void main(String[] args) {

        task01 laptop1 = new task01(8, 256, "Windows", "White");
        task01 laptop2 = new task01(16, 512, "Windows", "Black");
        task01 laptop3 = new task01(16, 256, "Linux", "White");
        task01 laptop4 = new task01(16, 512, "Linux", "Black");
        task01 laptop5 = new task01(32, 1024, "Windows", "Grey");

        HashSet<task01> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        for (task01 laptop : laptops) {
            System.out.println(laptop);
            System.out.println();
        }

        System.out.println();

        System.out.println(
                "==============================================================================================");
        System.out.println();
        Map<Integer, String> mapCrit = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        mapCrit.put(1, "RAM");
        mapCrit.put(2, "Oбъем HDD");

        System.out.println("Введите RAM (8, 16, 32): ");
        int tempRam = sc.nextInt();
        System.out.println("Введите объем HDD (256, 512, 1024): ");
        int tempHdd = sc.nextInt();

        sc.close();

        System.out.println();

        for (task01 lap : laptops) {
            if ((lap.getRam() >= tempRam) && (lap.getHddSize() >= tempHdd)) {
                System.out.println(lap.toString());
                System.out.println();

            }

        }

    }

}
