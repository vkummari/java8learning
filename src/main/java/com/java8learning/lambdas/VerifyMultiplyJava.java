package com.java8learning.lambdas;

public class VerifyMultiplyJava {

	public static void main(String[] args) {
		
		MultiplyFunc multiplyFunc = (int x) -> {return x*2;};
		
		System.out.println(multiplyFunc.multiplyBy2(100));
	}

}
