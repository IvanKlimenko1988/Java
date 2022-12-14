import java.util.*;

public class Main {
    //    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков.
//    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
//    и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//    Например:“Введите цифру, соответствующую необходимому критерию: "
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void showNotebooks(HashSet<Notebook> list) {
        for (Notebook item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("MSI", "15.6", 16, 256, "Windows", "black");
        Notebook notebook2 = new Notebook("Asus", "17.3", 8, 512, "Windows", "black");
        Notebook notebook3 = new Notebook("Apple", "13.3", 8, 128, "MacOS", "silver");
        Notebook notebook4 = new Notebook("Asus", "17.3", 16, 512, "Free DOS", "black");
        Notebook notebook5 = new Notebook("MSI", "17.3", 32, 1024, "Windows", "black");

        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

//        showNotebooks(notebooks);

        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "Фирма");
        filter.put(2, "Диагональ");
        filter.put(3, "ОЗУ");
        filter.put(4, "Объем ЖД");
        filter.put(5, "Операционная система");
        filter.put(6, "Цвет");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        for (int i = 1; i <= filter.size(); i++) {
            System.out.println(i + " - " + filter.get(i));
        }
        System.out.print("Ввод: ");
        int inputNum = sc.nextInt();
        System.out.printf("Выбран критерий: %d\n", inputNum);

        Iterator<Notebook> element = notebooks.iterator();

        boolean choice = true;
        while (choice) {
            if (inputNum == 1) {
                while (element.hasNext()) {
                    System.out.println(element.next().getBrand());
                    choice = false;
                }
            } else if (inputNum == 2) {
                while (element.hasNext()) {
                    System.out.println(element.next().getDiagonal() + "\"");
                    choice = false;
                }
            } else if (inputNum == 3) {
                while (element.hasNext()) {
                    System.out.println(element.next().getRAM() + "ГБ");
                    choice = false;
                }
            } else if (inputNum == 4) {
                while (element.hasNext()) {
                    System.out.println(element.next().getSSD() + "ГБ");
                    choice = false;
                }
            } else if (inputNum == 5) {
                while (element.hasNext()) {
                    System.out.println(element.next().getOS());
                    choice = false;
                }
            } else if (inputNum == 6) {
                while (element.hasNext()) {
                    System.out.println(element.next().getColor());
                    choice = false;
                }
            } else {
                System.out.println("Нет такого критерия!");
                System.out.println("Введите цифру, соответствующую необходимому критерию: ");
                inputNum = sc.nextInt();
            }
            if (!choice) {
                sc.close();
            }
        }


    }
}