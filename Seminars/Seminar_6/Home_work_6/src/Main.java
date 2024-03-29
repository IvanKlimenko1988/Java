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

    public static int inputNum;

    public static void insertFilter(HashSet<Notebook> list, Map<Integer, String> filters, Scanner sc) {
        Iterator<Notebook> element = list.iterator();
        System.out.print("Ввод: ");
        inputNum = sc.nextInt();
        if (filters.get(inputNum) == null)
            filters.put(inputNum, "Критерий в базе не найден!");
        System.out.printf("Выбран критерий: %s\n", filters.get(inputNum));
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
                System.out.println("Введите цифру, соответствующую необходимому критерию: ");
                inputNum = sc.nextInt();
            }
            if (!choice) {
                break;
            }
        }
    }

    public static void printValues(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            String value = pair.getValue();
            int val = pair.getKey();
            System.out.println(val + " - " + value);
        }
    }

    public static void delFilter(Map<Integer, String> filter) {
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        filter.remove(inputNum);
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notebook notebook1 = new Notebook("MSI", 15, 16, 256, "Windows", "White");
        Notebook notebook2 = new Notebook("Asus", 13, 8, 512, "Windows", "black");
        Notebook notebook3 = new Notebook("Apple", 13, 8, 128, "MacOS", "silver");
        Notebook notebook4 = new Notebook("Asus", 17, 16, 512, "FreeDOS", "black");
        Notebook notebook5 = new Notebook("MSI", 17, 32, 1024, "Windows", "black");

        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "Фирма");
        filter.put(2, "Диагональ");
        filter.put(3, "ОЗУ");
        filter.put(4, "Объем ЖД");
        filter.put(5, "Операционная система");
        filter.put(6, "Цвет");

        Map<String, Integer> valueFilter = new HashMap<>();
        Map<String, String> stringFilter = new HashMap<>();
        int value;
        int countChoice = 0;
        System.out.println("Введите параметр отфильтрованного товара: ");

        while (true) {
            printValues(filter);
            insertFilter(notebooks, filter, sc);
            String input = sc.next();
            if (isDigit(input)) {
                value = Integer.parseInt(input);//ошибка при вводе строки
                valueFilter.put(filter.get(inputNum), value);
                countChoice++;
                delFilter(filter);

            } else {
                stringFilter.put(filter.get(inputNum), input);
                countChoice++;
                delFilter(filter);
            }
            if (countChoice == 6) {
                break;
            }
        }

        List<Notebook> ram = notebooks.stream()
                .filter(item -> item.getRAM() == valueFilter.get("ОЗУ")).toList();
        List<Notebook> diag = notebooks.stream()
                .filter(item -> item.getDiagonal() == valueFilter.get("Диагональ")).toList();
        List<Notebook> ssd = notebooks.stream()
                .filter(item -> item.getSSD() == valueFilter.get("Объем ЖД")).toList();
        List<Notebook> brand = notebooks.stream()
                .filter(item -> item.getBrand() == stringFilter.get("Фирма")).toList();
        List<Notebook> os = notebooks.stream()
                .filter(item -> item.getOS() == stringFilter.get("Операционная система")).toList();
        List<Notebook> color = notebooks.stream()
                .filter(item -> item.getColor() == stringFilter.get("Цвет")).toList();


        for (int i = 0; i < ram.size(); i++) {
            System.out.println(ram.get(i));
        }
        for (int i = 0; i < diag.size(); i++) {
            System.out.println(diag.get(i));
        }
        for (int i = 0; i < ssd.size(); i++) {
            System.out.println(ssd.get(i));
        }
        for (int i = 0; i < brand.size(); i++) {
            System.out.println(brand.get(i));
        }
        for (int i = 0; i < os.size(); i++) {
            System.out.println(os.get(i));
        }
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
    }
}
