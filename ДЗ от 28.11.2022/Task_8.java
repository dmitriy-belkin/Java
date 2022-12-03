// Реализовать алгоритм сортировки слиянием

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = input.nextInt();
            int arr[] = new int[size];
            System.out.println("Введите построчно числа: ");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            int[] merged = mergeSort(arr, 0, arr.length - 1);

            for (int val : merged) {
                System.out.print(val + " ");
            }
        }

    }

    public static int[] firstSecondArrays(int[] first, int[] second) {

        int[] sort = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                sort[k] = first[i];
                k++;
                i++;
            } else {
                sort[k] = second[j];
                k++;
                j++;
            }
        }

        if (i == first.length) {

            while (j < second.length) {
                sort[k] = second[j];
                k++;
                j++;
            }
        }

        if (j == second.length) {

            while (i < first.length) {
                sort[k] = first[i];
                k++;
                i++;
            }
        }

        return sort;

    }

    public static int[] mergeSort(int[] arr, int left, int right) {

        if (left == right) {
            int[] tmp = new int[1];
            tmp[0] = arr[left];

            return tmp;
        }

        int middle = (left + right) / 2;

        int[] firstHalf = mergeSort(arr, left, middle);
        int[] secondHalf = mergeSort(arr, middle + 1, right);

        int[] combine = firstSecondArrays(firstHalf, secondHalf);

        return combine;
    }

}
