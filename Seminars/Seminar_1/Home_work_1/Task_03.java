package Home_work_1;

// Реализовать простой калькулятор
import java.util.Scanner;
public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор");
        System.out.println("Возможные операции: 1:'+', 2:'-', 3:'*', 4:'/'");
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите операцию: ");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Результат: " + (a + b));
                break;
            case 2:
                System.out.println("Результат: " + (a - b));
                break;
            case 3:
                System.out.println("Результат: " + (a * b));
                break;
            case 4:
                float c = (float) a / b;
                if (b == 0)
                    System.out.println("На ноль делить нельзя!");
                else
                    System.out.println("Результат: " + c);
                break;
        }
        sc.close();
    }
}
