import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Task_01
//        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//        уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        ArrayList<Integer> userList = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            userList.add(new Random().nextInt(25));
        }
        System.out.printf("Процент уникальных значений %s%s", uniqueNum(userList), "%");
        //Task_02
        Cat cat1 = new Cat("Бельчик", "Белый", 3);
        Cat cat2 = new Cat("Рыжик", "Рыжий", 5);
        Cat cat3 = new Cat("Чернышь", "Черный", 1);
        Cat cat4 = new Cat("Чернышь", "Черный", 1);

//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat3);
//
//
//        System.out.println(cat1.say());
//        Task_03
//        1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//        2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//        3. Создайте метод public boolean equals(Object o)
//        Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        for (Cat c : cats) {true, только если значения во всех полях сравниваемых объектов равны.
//        4. Создайте метод public int hashCode()
//        который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//        5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
            HashSet<Cat> cats = new HashSet<Cat>();
            System.out.println(c);
        }
        System.out.println(cat4.equals(cat3));
        System.out.println(cat4.hashCode() == cat3.hashCode());






    }

    private static double uniqueNum(ArrayList<Integer> list) {
        HashSet<Integer> newSet = new HashSet<>(list);
        return ((double) newSet.size() / (double) list.size()) * 100;
    }


}