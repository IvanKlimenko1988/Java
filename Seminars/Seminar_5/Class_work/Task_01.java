package Seminars.Seminar_5.Class_work;


import java.util.HashMap;
import java.util.Map.Entry;

public class Task_01 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(123456, "Ivanov");
        employees.put(321456, "Vasiliev");
        employees.put(234561, "Petrova");
        employees.put(234432, "Ivanov");
        employees.put(654321, "Petrova");
        employees.put(345678, "Ivanov");
        for (Entry<Integer, String> entry : employees.entrySet())
            if (entry.getValue().equals("Ivanov"))
                System.out.println(String.format("%d %s", entry.getKey(), entry.getValue()));

    }
}

