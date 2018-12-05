package com.java8learning.lambdas;

public class MultipleImplOfInterface {

	public static void main(String[] args) {
		
		Func1 func1 = (x, y) -> x + y;
		
		Func1 func2 = (x, y) -> x * y;
		
		System.out.println(func1.perform(10, 20));
		
		System.out.println(func2.perform(10, 20));
		
	}
	
	interface Func1 {
		int perform(int x, int y);
	}
	
	interface Func2 {
		String display(String message);
	}
	
	

}
