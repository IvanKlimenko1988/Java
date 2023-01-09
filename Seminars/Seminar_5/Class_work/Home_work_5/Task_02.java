package Class_work.Home_work_5;

import java.util.*;

public class Task_02 {
    //    Пусть дан список сотрудников:Иван Иванов и т.д.
    //    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    //    Отсортировать по убыванию популярности.
    public static void createDublName(List<String> peoplesList){
        Map<String, Integer> countName = new HashMap<String, Integer>();
        for (int i = 1; i < peoplesList.size(); i = i + 2) {
            if (countName.containsKey(peoplesList.get(i))) {
                countName.put(peoplesList.get(i), countName.get(peoplesList.get(i)) + 1);
            } else {
                countName.put(peoplesList.get(i), 1);
            }
        }
        countName.entrySet().removeIf(count -> count.getValue() == 1);
        List<Map.Entry<String, Integer>> lst = new ArrayList<>(countName.entrySet());
        lst.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println(lst);
    }
    public static void main(String[] args) {
        String peoples = "Бочаров Даниил,Лавров Артём,Мартынов Фёдор,Никитина Малика,Ермолов Малика,"
                + "Комаров Роман,Федосеева Таисия,Борисов Захар,Захаров Лев,Морозов Фёдор,"
                + "Суслов Артём,Белов Лев,Богданова Медина,Николаева Варвара,Некрасова Мария,"
                + "Денисов Виталий,Виноградов Иван,Овчинников Ярослав,Смирнов Артур,Мещеряков Али,"
                + "Кузнецов Иван,Лаврентьев Артём,Ковалева София,Михайлова Елизавета,Николаева Анна,"
                + "Дмитриев Макар,Горбачев Иван,Зубов Даниэль,Степанов Иван,Попов Елисей,Сорокин Макар,"
                + "Виноградова Анна,Пирогова Мария,Щербаков Сергей,Смирнова Валентина,Полякова Яна,"
                + "Лазарева Анна,Соколова Варвара,Карпов Илья,Климов Матвей,Никитин Михаил,"
                + "Шевцова Ольга,Попова София,Чеснокова Диана,Быков Георгий,Киселев Иван,Чернышева Анна";
        peoples = peoples.replace(",", " ");
        String[] peoplesArray = peoples.split(" ");
        List<String> peoplesList = new ArrayList<String>(Arrays.asList(peoplesArray));
        createDublName(peoplesList);
    }
}


