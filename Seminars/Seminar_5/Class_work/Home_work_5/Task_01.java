package Class_work.Home_work_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
//        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//        что 1 человек может иметь несколько телефонов.

        Map<String, String> telBook = new HashMap<String, String>();
        Map<String, String> secondNumber = new HashMap<String, String>();
        boolean exit = true;
        while (exit) {
            System.out.println("'Телефонная кника'\n1. Показать контакты\n2. Добавить контакт\n3. Добавить второй номер\n4. Удалить контакт\n5. Выход.");
            Scanner inputScan = new Scanner(System.in);
            String input = inputScan.nextLine();
            if (input.equals("1")) {
                System.out.println("Контакты: " + telBook);
                System.out.println("Второй номер: " + secondNumber);
            } else if (input.equals("2")) {
                System.out.print("Введите Имя: ");
                String name = inputScan.nextLine();
                System.out.print("Введите номер телефона: ");
                String tel = inputScan.nextLine();
                telBook.put(name, tel);
            } else if (input.equals("3")) {
                System.out.print("Введите имя контакта: ");
                String name = inputScan.nextLine();
                if (telBook.containsKey(name)) {
                    System.out.print("Введите номер телефона: ");
                    String tel = inputScan.nextLine();
                    secondNumber.put(name, tel);
                } else {
                    System.out.println("Такого контакта нет в книге.");
                }
            } else if (input.equals(("4"))) {
                System.out.print("Введите имя контакта: ");
                String name = inputScan.nextLine();
                if (telBook.containsKey(name)) {
                    telBook.remove(name);
                    secondNumber.remove(name);
                    System.out.println("Контакт успешно удален");
                } else {
                    System.out.println("Такого контакта нет в книге.");
                }
            } else if (input.equals("5")) {
                exit = false;
                inputScan.close();
                System.out.println("Программа закрыта!");
            } else {
                System.out.println("Некоректный ввод!");
            }
        }
    }
}

