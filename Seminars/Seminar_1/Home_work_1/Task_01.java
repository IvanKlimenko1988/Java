package Home_work_1;
import java.util.Scanner;
// Задача: Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
public class Task_01 {
    static int find_sum_num(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++)
            sum += i;
        return sum;
    }
    static int factorial(int num) {
        int fact = 1;
        if (num == 1 || num == 0)
            return fact;
        else {
            for (int i = 0; i < num - 1; i++) {
                fact += fact * (i + 1);
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int result = find_sum_num(n);
        System.out.println("n-ое треугольное число = " + result);
        int factorial = factorial(n);
        System.out.println("!" + n + " = " + factorial);
        scanner.close();
    }

}