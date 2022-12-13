package Seminars.Seminar_2.Home_work_2;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.io.FileReader;
import java.util.logging.SimpleFormatter;


// Задача 4: 
// К калькулятору из предыдущего дз добавить логирование.
public class Task_04 {
    // public static final Logger logger = Logger.getGlobal();
    

    public static void main(String[] args) {
        try {
        Logger logger = Logger.getLogger(Task_04.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);
        logger.info("Program start");
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
                    writeLog(sb.toString(), "log.txt");
                }
               
            }
        else{
            System.out.println("Такой операции нет!");
        }
        sc.close();    
        } catch (Exception e) {
            System.out.printf("Исключение: %s", e);
        }


    }
    public static void writeLog(String s, String file) throws Exception{
        File log = new File(file);
        FileWriter fw = new FileWriter(log, true);
        fw.write(s);
        fw.write("\n");;
        fw.flush();
        fw.close();
    }
}
