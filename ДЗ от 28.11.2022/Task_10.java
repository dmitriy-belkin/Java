// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_10 {
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

        int min = arrList.get(0);
        int max = arrList.get(0);
        float middle = 0;

        for (Integer i : arrList) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        for (int i = 0; i < arrList.size(); i++) {
            middle += arrList.get(i);
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее число: " + middle / arrList.size());

    }
}