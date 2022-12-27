package Seminars.Seminar_5.Class_work;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_04_2 {
    public static Map<Integer, String> InitMap() {
        Map<Integer, String> ArabToRoman = new LinkedHashMap<Integer, String>();        
        ArabToRoman.put(1000, "M");        
        ArabToRoman.put(900, "CM");        
        ArabToRoman.put(500, "D");        
        ArabToRoman.put(400, "CD");
        ArabToRoman.put(100, "C");        
        ArabToRoman.put(90, "XC");        
        ArabToRoman.put(50, "L");
        ArabToRoman.put(40, "XL");        
        ArabToRoman.put(10, "X");
        ArabToRoman.put(9, "IX");
        ArabToRoman.put(5, "V");
        ArabToRoman.put(4, "IV");
        ArabToRoman.put(1, "I");
        return ArabToRoman;
    }

    public static String ArabToRoman(int number) {
        Map<Integer, String> ArabMap = InitMap();
        String result = "";
        for (Map.Entry<Integer, String> elemEntry : ArabMap.entrySet()) {
            if (number >= elemEntry.getKey()) {
                int tmp = number / elemEntry.getKey();
                result += elemEntry.getValue().repeat(tmp);
                number -= tmp * elemEntry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(ArabToRoman(2022));
        System.out.println(ArabToRoman(44));
        System.out.println(ArabToRoman(96));
        System.out.println(ArabToRoman(4597));
    }
}
