// +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.

public class Task_4 {

    public static void main(String[] args) {
        calculation();
    }

    public static void calculation() {
        int sum = 69;
        String firstNumber = "2?";
        String secondNumber = "5?";
        for (int i = 0; i < 10; i++) {
            String newFirstNumber = firstNumber.replace(firstNumber, "2" + i);
            int newFirstInt = Integer.parseInt(newFirstNumber);
            for (int j = 0; j < 10; j++) {
                String newSecondNumber = secondNumber.replace(secondNumber, "4" + j);
                int newsecondInt = Integer.parseInt(newSecondNumber);
                if (newFirstInt + newsecondInt == sum) {
                    System.out.println("Если 'а' = " + newFirstInt + ", то 'b' = " + newsecondInt + ", что в сумме дает " + sum);
                }
            }
        }
    }
}
