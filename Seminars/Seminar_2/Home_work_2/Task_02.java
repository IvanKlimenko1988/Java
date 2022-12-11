package Seminars.Seminar_2.Home_work_2;

import java.io.FileWriter;
import java.io.IOException;
// Задача 2:
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task_02 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("log_bubble.txt", false)) {
            int[] array = { 9, 6, 4, 62, 12, 10, 23, 8, 1, 2 };
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                for (int j : array) writer.append(Integer.toString(j) + " ");
                writer.append('\n');
                writer.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
