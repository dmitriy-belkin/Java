import java.util.*;

public class Task_16 {
    public static void main(String[] args) {
        Map<String, Integer> nameList = new HashMap<>();
        String listEmployees = "Иван Иванов " + "Светлана Петрова " + "Кристина Белова " + "Анна Мусина " +
                "Анна Крутова " + "Иван Юрин " + "Петр Лыков " + "Павел Чернов " + "Петр Чернышов " + "Мария Федорова "
                +
                "Марина Светлова " + "Мария Савина " + "Мария Рыкова " + "Марина Лугова " + "Анна Владимирова " +
                "Иван Мечников " + "Петр Петин " + "Иван Ежов ";
        String[] registryName = listEmployees.split(" ");
        for (int i = 0; i < registryName.length; i += 2) {
            if (nameList.containsKey(registryName[i])) {
                nameList.replace(registryName[i], nameList.get(registryName[i]) + 1);
            } else {
                nameList.put(registryName[i], 1);
            }   
        }
        System.out.println(nameList);
        Map<String, Integer> sortedRegistryName = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameList.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameList.entrySet()) {
                String key = entry.getKey();
                if (nameList.get(key) == i) {
                    sortedRegistryName.put(key, nameList.get(key));
                }
            }
        }
        System.out.println(sortedRegistryName);
    }
}