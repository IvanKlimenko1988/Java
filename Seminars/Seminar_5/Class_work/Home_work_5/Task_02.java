package Class_work.Home_work_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class Task_02 {
    //    Пусть дан список сотрудников:Иван Иванов и т.д.
//    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.
    public static void main(String[] args) {
        Map<String, String> personals = new HashMap<String, String>();

        String str = "1 Пётр,2 Иван,1 Пётр,1 Пётр,2 Иван";
//        String peoples = "Антонова Варвара,Власов Артём,Алексеева Полина,"
//                + "Бочаров Даниил,Лавров Артём,Мартынов Фёдор,Никитина Малика,Ермолов Степан,"
//                + "Комаров Роман,Федосеева Таисия,Борисов Захар,Захаров Лев,Морозов Фёдор,"
//                + "Суслов Артём,Белов Лев,Богданова Медина,Николаева Варвара,Некрасова Мария,"
//                + "Денисов Виталий,Виноградов Иван,Овчинников Ярослав,Смирнов Артур,Мещеряков Али,"
//                + "Кузнецов Арсений,Лаврентьев Артём,Ковалева София,Михайлова Елизавета,Николаева Анна,"
//                + "Дмитриев Макар,Горбачев Павел,Зубов Даниэль,Степанов Давид,Попов Елисей,Сорокин Макар,"
//                + "Виноградова Анна,Пирогова Мария,Щербаков Сергей,Смирнова Валентина,Полякова Яна,"
//                + "Лазарева Татьяна,Соколова Варвара,Карпов Илья,Климов Матвей,Никитин Михаил,"
//                + "Шевцова Ольга,Попова София,Чеснокова Диана,Быков Георгий,Киселев Иван,Чернышева Олеся";
//        peoples = peoples.replace(",", " ");
//        String[] peoplesArray = peoples.split(" ");
//
//        for (int i = 0; i < peoplesArray.length; i = i + 2) {
//            personals.put(peoplesArray[i], peoplesArray[i + 1]);
//        }
//        int count = 0;
//        int sum = 0;
//        HashSet<String> name = new HashSet<String>();
//        HashMap<String, Integer> result = new HashMap<String, Integer>();
//        for (int i = 1; i < peoplesArray.length; i = i + 2) {
//            for (int j = i + 2; j < peoplesArray.length; j = j + 2) {
//                if (peoplesArray[i].equals(peoplesArray[j])) {
//                    if (result.containsKey(peoplesArray[i])) {
//                        sum = result.get(peoplesArray[j]) + 1;
//                        result.put(peoplesArray[j], sum);
//                        sum = 0;
//                        continue;
//
//                    } else {
//                        result.put(peoplesArray[i], sum + 1);
//
//                    }
//                }
//                System.out.println(count);
//            }
//        }
//        System.out.println(result);
//        for (int i = 1; i < peoplesArray.length; i = i + 2) {
//            for (int j = i + 2; j < peoplesArray.length; j = j + 2) {
//                if (peoplesArray[i].equals(peoplesArray[j])) {
//                    System.out.println("Совпадение");
//                    System.out.println(peoplesArray[i] + " " + peoplesArray[j]);
//
//                    }
//                }
//            }
        Map<String, Integer> map = new HashMap<>();
//        String str = "Russia goes ahead of the whole planet. The planet is not Russia.";
        str = str.toLowerCase();
        str = str.replace(".", "");
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry :map.entrySet()) {
            System.out.println("The word - " + entry.getKey() + " - meets " + entry.getValue());
        }
    }
}

