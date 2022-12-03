// Реализовать простой калькулятор

import java.util.Scanner;

public class Task_3 {
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
					System.out.println("На ноль делить нельзя");
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

		System.out.println(firstNumber + " " + operationSign + " " + secondNumber + " = " + resultOperation);

	}
}
