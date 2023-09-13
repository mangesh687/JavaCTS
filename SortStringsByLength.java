package com.apps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortStringsByLength {

	public static void main(String[] args) {
		List<String> strings = new ArrayList();
		strings.add("apple");
		strings.add("banana");
		strings.add("cherry");
		strings.add("date");
		strings.add("fig");

		Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println("Sorted list based on length:");
		for (String str : strings) {
			System.out.println(str);
		}

	}

}
