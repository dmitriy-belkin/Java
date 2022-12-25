import java.util.Scanner;

public class Task_17 {
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = input.nextInt();
            int arr[] = new int[size];
            System.out.println("Введите построчно числа: ");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            heapSort(arr);
            System.out.print("Пирамидальная сортировка: ");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, i, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int a = i * 2 + 1;
        int b = i * 2 + 2;
        int max = i;

        if (a < n && arr[a] > arr[max])
            max = a;
        if (b < n && arr[b] > arr[max])
            max = b;

        if (i != max) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(arr, max, n);
        }
    }
}