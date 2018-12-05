package com.java8learning.lambdas;

public class VerifyAdditionFunction {

	public static void main(String[] args) {

		Integer[] intValues = {123, 134};
		
		Integer[] intSecondSet = {2, 4, 5};
		
		System.out.println(AdditionFuncFactory.create(AdditionFunctionImpl::new).add(intValues));
		
		System.out.println(AdditionFuncFactory.create(AdditionFunctionImpl2::new).add(intSecondSet));
	}

}
