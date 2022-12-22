package Seminars.Seminar_4.Home_work_4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task_01 {
    public static LinkedList<Integer> reversList(LinkedList<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(list.get(i));
            list.remove(i);
        }
        return list;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(reversList(list));
    }
}
