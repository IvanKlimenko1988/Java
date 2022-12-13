package Seminars.Seminar_3.Class_work;
import java.util.Arrays;
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.
import java.util.Random;
public class Task_02 {
    public static void main(String[] args) {
        Random randNum = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = randNum.nextInt(10);
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");


          
        }
    }
}
