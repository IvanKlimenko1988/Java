package Seminars.Seminar_2;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
// 12321
// шалаш
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // String str = "12321";
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                flag = false;
        }
        System.out.println(flag);
        scanner.close();
    }
}
