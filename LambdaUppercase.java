package com.apps;

import java.util.Scanner;
import java.util.function.Function;

public class LambdaUppercase {

	public static void main(String[] args) {
		Function<String, String> uppercaseLambda = str -> str.toUpperCase();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		String result = uppercaseLambda.apply(inputString);

		System.out.println("Uppercase version: " + result);

		scanner.close();
	}

}
