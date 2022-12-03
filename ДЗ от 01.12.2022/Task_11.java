// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Scanner;
// import java.util.Collections;

public class Task_11 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите первую подстроку: ");
            String item1 = in.nextLine();
            System.out.print("Введите вторую подстроку: ");
            String item2 = in.nextLine();
            list.add(item1);
            list.add(item2);
        }

        System.out.println("Первоначальный список: " + list);
        for (int i = 0, mid = list.size() / 2, j = list.size() - 1; i < mid; i++, j--)
            list.set(i, list.set(j, list.get(i)));
        // Collections.reverse(list);
        System.out.println("Реверсивный список: " + list);

    }
}