package Seminars.Seminar_3.Home_work_3;
import java.util.ArrayList;
import java.util.Random;
// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task_02 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> arr = new ArrayList<>(10);
        
        for (int i = 0; i < size; i++) {
            arr.add(new Random().nextInt(100));
        }
        for (Integer elem : arr) {
            System.out.print(elem + " ");   
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
                i--;
            }
        }
        System.out.println();
        for (Integer elem : arr) {
            System.out.print(elem + " "); 
    }
}
}