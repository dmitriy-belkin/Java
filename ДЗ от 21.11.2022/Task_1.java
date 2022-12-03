// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;



public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int multi = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " * ");
            multi *= i;
        }
        System.out.print(" = " + multi);

        System.out.println();

        for (int j = 1; j <= n; j++) {
            System.out.print(j + " + ");
            sum += j;
        }

        scanner.close();

        System.out.print(" = " + sum);
    }
}