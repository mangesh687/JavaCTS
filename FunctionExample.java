package com.apps;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Integer> multiplyBy2 = x -> x * 2;

		Function<Integer, Integer> add3 = x -> x + 3;

		int number = 5;

		int result1 = multiplyBy2.apply(number);
		int result2 = add3.apply(number);

		System.out.println("Original number: " + number);
		System.out.println("Result after multiplying by 2: " + result1);
		System.out.println("Result after adding 3: " + result2);

	}

}
