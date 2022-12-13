package Seminars.Seminar_2.Home_work_2;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
// import java.io.FileReader;


// Задача 4: 
// К калькулятору из предыдущего дз добавить логирование.
public class Task_04 {
    public static void main(String[] args) {
        try {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор");
        System.out.println("Возможные операции: 1:'+', 2:'-', 3:'*', 4:'/'");
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите операцию: ");
        int operation = sc.nextInt();
        System.out.println(operation);
        String result;
        if(operation == 1){
            sb.append(a);
            sb.append("+");
            sb.append(b);
            sb.append("=");
            System.out.println("Результат: " + (a + b));
            result = Integer.toString(a + b);
            sb.append(result);
            writeLog(sb.toString(), "log.txt");
        }
        else if (operation == 2){
            sb.append(a);
            sb.append("-");
            sb.append(b);
            sb.append("=");
            System.out.println("Результат: " + (a - b));
            result = Integer.toString(a - b);
            sb.append(result);
            writeLog(sb.toString(), "log.txt");
        }
        else if(operation == 3){
            sb.append(a);
            sb.append("*");
            sb.append(b);
            sb.append("=");
            System.out.println("Результат: " + (a * b));
            result = Integer.toString(a * b);
            sb.append(result);
            writeLog(sb.toString(), "log.txt");
        }
        else if (operation == 4){
            sb.append(a);
            sb.append("/");
            sb.append(b);
            sb.append("=");
            float c = (float) a / b;
                if (b == 0) System.out.println("На ноль делить нельзя!");
                else{
                    System.out.println("Результат: " + c);
                    sb.append(c);
                    logger.info("result = " + c);
                    writeLog(sb.toString(), "log.txt");
                }
            } else {
                logger.info("Operation not found");
                System.out.println("Такой операции нет!");
            }
            sc.close();
        } catch (Exception e) {
            
            System.out.printf("Исключение: %s", e);
        }
    }
}
