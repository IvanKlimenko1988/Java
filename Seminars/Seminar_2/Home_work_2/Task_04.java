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
        if(operation == 1){
            sb.append(a);
            sb.append("+");
            sb.append(b);
            sb.append("=");
            String result;
            System.out.println("Результат: " + (a + b));
            result = Integer.toString(a + b);
            sb.append(result);
            writeLog(sb.toString(), "log.txt");
            }
        sc.close();    
        } catch (Exception e) {
            System.out.printf("Исключение: %s", e);  // TODO: handle exception
        }
        

        // } 
        // switch (operation) {
        //     case 1:
        //         String result;
        //         System.out.println("Результат: " + (a + b));
        //         result = Integer.toString(a + b);
        //         writeLog(result, "log.txt");
        //         break;
    
                
        //     case 2:
        //         System.out.println("Результат: " + (a - b));
        //         result = Integer.toString(a - b);
        //         System.out.println(result);
                
        //         break;
        //     case 3:
        //         System.out.println("Результат: " + (a * b));
        //         break;
        //     case 4:
        //         float c = (float) a / b;
        //         if (b == 0)
        //             System.out.println("На ноль делить нельзя!");
        //         else
        //             System.out.println("Результат: " + c);
        //         break;
            
          

    }
    public static void writeLog(String s, String file) throws Exception{
        File log = new File(file);
        FileWriter fw = new FileWriter(log);
        fw.write(s);
        fw.write("\n");;
        fw.flush();
        fw.close();
    }
}
