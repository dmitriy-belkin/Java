// Реализуйте алгоритм сортировки пузырьком числового массива, результат запишите в лог-файл.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = input.nextInt();
            int arr[] = new int[size];
            System.out.println("Введите построчно числа: ");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            boolean isSorted = false;
            int tempNumber;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        isSorted = false;

                        tempNumber = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tempNumber;
                    }
                }
            }
            System.out.println();
            System.out.println("=============Вывод в консоль=============");
            System.out.println(Arrays.toString(arr));
            System.out.println();
            System.out.println("======Логируем в файл log.json======");
            Path path = Paths.get("log.json");
            try {
                String str = Arrays.toString(arr);
                byte[] bs = str.getBytes();
                Path writtenFilePath = Files.write(path, bs);
                System.out.println("Содержимое записанно в файл:\n" + new String(Files.readAllBytes(writtenFilePath)));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println();
            }
        }
    }
}
