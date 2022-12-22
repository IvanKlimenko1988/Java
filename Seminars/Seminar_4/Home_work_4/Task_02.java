package Seminars.Seminar_4.Home_work_4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue()
//  - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
//   из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
public class Task_02 {
    public static void enqueue(LinkedList<Integer> list ,int element){ //Добавить элемет в конец очереди
        list.add(element);
    }
    public static Integer dequeue(LinkedList<Integer> list){ //возвращает первый элемент и удаляет его
        return list.poll();
        
    }
    public static Integer first(LinkedList<Integer> list){ //возвращает первый элемент из очереди, но не удаляет его
        return list.peekFirst();  
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        enqueue(list, 152);
        System.out.println(list);
        int firstElem = first(list);
        System.out.println(firstElem);
        System.out.println(list);
        int firstDel = dequeue(list);
        System.out.println(firstDel);
        System.out.println(list);
    }
}
