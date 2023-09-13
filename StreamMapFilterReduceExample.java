package com.apps;

import java.util.Arrays;
import java.util.List;

public class StreamMapFilterReduceExample {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");

		String result = strings.stream().map(String::toUpperCase).filter(s -> s.length() >= 4).reduce("",
				(accumulator, s) -> accumulator + s);

		System.out.println("Concatenated result: " + result);

	}

}
