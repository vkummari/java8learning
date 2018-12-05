package com.java8learning.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ConsumerFuncInterfaceEx {

	public static void main(String[] args) {
		
		//Printing the list of Integers
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		
		intList.forEach(e -> System.out.println(e));

	}

}
