// Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            boolean PrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }

            if (PrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
