package Seminars.Seminar_5.Class_work;

import java.util.HashMap;

// Написать метод, который переведет число из римского формата записи в арабский. 
// Например, MMXXII = 2022
// http://graecolatini.bsu.by/htm-different/num-converter-roman.htm
public class Task_03 {
    public static void main(String[] args) {
        String[] arab = "MMXXII".split("");
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        hashMap.put("M", 1000);
        hashMap.put("VI", 6);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);
        int sum = 0;
        for (int i = 0; i < arab.length; i++) {
            if (arab.length - 1 > i){
                if(hashMap.containsKey(arab[i] + arab[i + 1])){
                    sum += hashMap.get(arab[i] + arab[i+1]);
                    i++;
                }else{
                    sum += hashMap.get(arab[i]);
                }
            }else{
                sum += hashMap.get(arab[i]);
            }
        }
        System.out.println(sum);



    }
}
