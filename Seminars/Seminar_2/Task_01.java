package Seminars.Seminar_2;
import java.util.Scanner;
public class Task_01 {
    // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.


public static void main(String[] args) {
    char a = '1';
        char b = '0';
        System.out.println("Введите  четное целое число: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        if (num % 2 != 0) {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите ЧЕТНОЕ целое число: ");
                int new_num = n.nextInt();
                if (new_num % 2 == 0) {
                    flag = false;
                }
        }
    }
StringBuilder answer = new StringBuilder();

        for (int i = 0; i < num; i++) {
           if (i % 2 == 0) {
            answer.append(a);
           } else {
            answer.append(b);
           }                     

        }
        System.out.println(answer);
        n.close();
    }
}


