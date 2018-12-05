package com.java8learning.lambdas;

import java.util.Arrays;
import java.util.List;

public class ArrayIterationAndPrinting {

	public static void main(String[] args) {
		
		Arrays.asList("a", "b", "c").forEach( e -> {System.out.println("Element value is " +e);});

		Arrays.asList("a", "b", "c").forEach( (String e) -> {System.out.println("Element value is " +e);});

		List<String> charList = Arrays.asList("a", "b", "c", "d", "c");
		charList.sort( (a , b) -> a.compareTo(b));
		
		
		charList.forEach(e -> System.out.println(e));
	}

}
