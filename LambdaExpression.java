package com.apps;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class LambdaExpression {

	public static void main(String[] args) {

		BinaryOperator<Integer> addition = (x, y) -> x + y;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		int num2 = scanner.nextInt();

		int result = addition.apply(num1, num2);

		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

		scanner.close();
	}

}
