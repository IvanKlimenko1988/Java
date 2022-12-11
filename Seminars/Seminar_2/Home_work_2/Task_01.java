package Seminars.Seminar_2.Home_work_2;
// Задача 1:

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// select * from Students where name = 'Ivanov' and country = 'Russia' and Ciry = 'Moscow' and age = null

import java.util.HashMap;

public class Task_01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);

        StringBuilder sb = new StringBuilder();
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue() == null)
                continue;
            sb.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }
        sb.delete(sb.length() - 5, sb.length());
        System.out.println(sb);
    }

}
