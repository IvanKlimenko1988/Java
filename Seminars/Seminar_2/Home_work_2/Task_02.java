package Seminars.Seminar_2.Home_work_2;

import java.security.Principal;
import java.util.PrimitiveIterator;

// Задача 2:
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// {1,6,3,7,2,5,4,8,10,9}
// 1 3 6 2 5 4 7 8 9 10 
public class Task_02 {
    public static void main(String[] args) {
        int[] array = {9,6,3,7,2,5,4,8,10,9};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
            }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
