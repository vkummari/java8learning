package com.java8learning.lambdas;

@FunctionalInterface
public interface AdditionFunction {

	public int add(Integer[] a);
	
	public static void printArray(Integer[] a) {
		
		System.out.println("Printing Integer Array Here");
	};
	
	default void doNothing()
	{
		System.out.println("Does nothing");
	}
	
	default void doNothing(String word)
	{
		System.out.println("Does nothing");
	}
	
	default int doSum(String word)
	{
		return 0;
	}
}
