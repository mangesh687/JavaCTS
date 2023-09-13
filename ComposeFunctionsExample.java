package com.apps;

import java.util.function.Function;

public class ComposeFunctionsExample {

	public static void main(String[] args) {
		Function<Integer, Integer> multiplyBy2 = x -> x * 2;

		Function<Integer, Integer> add3 = x -> x + 3;

		Function<Integer, Integer> multiplyBy2AndAdd3 = multiplyBy2.andThen(add3);

		int number = 5;
		int result = multiplyBy2AndAdd3.apply(number);

		System.out.println("Original number: " + number);
		System.out.println("Result after multiplying by 2 and adding 3: " + result);

	}

}
