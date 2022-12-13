package Seminars.Seminar_3.Class_work;
import java.util.Arrays;
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
import java.util.Random;
import java.sql.Array;
public class Task_03 {
   public static void main(String[] args) {
    String [] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер","Сатурн", "Уран", "Нептун"};
    String [] new_planets = new String[8];
    int count = 0;
    Random rand = new Random();
    for (int i = 0; i < new_planets.length; i++) {
        new_planets[i] = planets[rand.nextInt(planets.length)];
    }
    for (int i = 0; i < new_planets.length; i++) { 
    }
    for (String string : new_planets) {
        System.out.println(string);
    }
    Arrays.sort(new_planets);
        System.out.println();
    for (String string : new_planets) {
        System.out.println(string);
    }
    for (int i = 0; i < new_planets.length-1; i++) {
        if (new_planets[i].equals(new_planets[i+1])){
            count++;    
        }
        else count=0;
        System.out.println(count);
    }

   } 
}
