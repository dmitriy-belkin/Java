/* 
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя 
StringBuilder. Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр 
не должен попадать в запрос. Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", 
"age":"null"}
то есть должно получиться что-то вроде:
... where name = Ivanov and country = Russia and city = Moscow
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);

        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder value = new StringBuilder();
        if (params == null || params.isEmpty())
            return value.toString();

        for (Map.Entry<String, String> two : params.entrySet()) {
            if (two.getKey() == null || two.getValue() == null)
                continue;

            value.append(two.getKey()).append(" = '").append(two.getValue()).append("' and ");
        }

        if (value.length() > 5)
            value.delete(value.length() - 5, value.length());

        return value.toString();
    }
}