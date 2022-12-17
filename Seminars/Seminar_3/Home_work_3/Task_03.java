package Seminars.Seminar_3.Home_work_3;

import java.util.ArrayList;
import java.util.Random;



// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task_03 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> arr = new ArrayList<>(10);
        
        for (int i = 0; i < size; i++) {
            arr.add(new Random().nextInt(100));
        }
        for (Integer elem : arr) {
            System.out.print(elem + " ");   
        }
        int min = arr.get(0);
        int max = arr.get(0);
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum +=arr.get(i);
            if (min > arr.get(i)){
                min = arr.get(i);
            }
            if (max < arr.get(i)){
                max = arr.get(i);
            }
        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
    }

