package com.java8learning.lambdas;

public class AdditionFunctionImpl2 implements AdditionFunction {

	@Override
	public int add(Integer[] a) {
		
		System.out.println("Inside AdditionFunctionImpl2");
		int sum = 0;
		for(Integer value : a)
		{
			sum = sum + value;
		}
		return sum;
	}

}
