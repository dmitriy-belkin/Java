// Дан произвольный список целых чисел. Удалить из него четные числа

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_9 {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.println("Введите построчно числа. Для завершения дважды нажмите Enter: ");

        while (true) {
            String s = read.readLine();
            if (s.isEmpty())
                break;
            arrList.add(Integer.parseInt(s));
        }

        System.out.printf("Введенный вами список: %s\n", arrList);
        int i = 0;

        while (i < arrList.size()) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            } else {
                i++;
            }
        }

        System.out.printf("Список с нечетными числами: %s", arrList);
    }
}