// К калькулятору из предыдущего дз добавить логирование

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Task_7 {
    private static Logger Logger = java.util.logging.Logger.getLogger(Task_7.class.getName());

    public static void main(String[] args) {

        double firstNumber, secondNumber, resultOperation;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextDouble();

        System.out.print("Введите знак операции (+, -, /, *, ^, %): ");

        char operationSign = scanner.next().charAt(0);
        scanner.close();

        switch (operationSign) {
            case '+':
                resultOperation = firstNumber + secondNumber;
                break;

            case '-':
                resultOperation = firstNumber - secondNumber;
                break;

            case '*':
                resultOperation = firstNumber * secondNumber;
                break;

            case '/':
                resultOperation = firstNumber / secondNumber;
                if (secondNumber == 0) {
                    Path path = Paths.get("error.txt");
                    try {
                        String str = "Произошла ошибка: на ноль делить нельзя!";
                        byte[] bs = str.getBytes();
                        Path writtenFilePath = Files.write(path, bs);
                        System.out.println(new String(Files.readAllBytes(writtenFilePath)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    };
                } else {
                    break;
                }

            case '%':
                resultOperation = firstNumber % secondNumber;
                break;

            case '^':
                resultOperation = Math.pow(firstNumber, secondNumber);
                break;

            case 'Q':
                System.exit(0);

            default:
                System.out.printf("Вы ввели неверный знак операции");
                return;

        }
        System.out.println();
        System.out.println("======Логируем в файл log.txt======");
        Path path = Paths.get("log.txt");
        try {
            String str = firstNumber + " " + operationSign + " " + secondNumber + " = " + resultOperation;
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path, bs);
            System.out.println("Записанно содержимое в файл:\n" + new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("======Логируем в консоль======");
        Logger.log(Level.INFO, firstNumber + " " + operationSign + " " + secondNumber + " = " + resultOperation);

    }
}
