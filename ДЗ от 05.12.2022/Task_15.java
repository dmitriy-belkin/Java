import java.util.HashMap;
import java.util.List;

public class Task_15 {
    public static HashMap<String, List<String>> telephoneDirectory = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Василенко");
    }

    public static void addInPhoneBook() {
        telephoneDirectory.put("Василенко", List.of("+380 44 7854257", "+380 44 1414222"));
        telephoneDirectory.put("Сорочан", List.of("+380 44 4598774", "+380 44 2536552"));
        telephoneDirectory.put("Косяк", List.of("+380 44 8574457", "+380 44 3568954"));
        telephoneDirectory.put("Семенов", List.of("+380 44 2555877", "+380 446598888"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, telephoneDirectory.get(surname));
    }
}