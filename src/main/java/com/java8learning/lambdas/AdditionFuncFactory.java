package com.java8learning.lambdas;

import java.util.function.Supplier;

public interface AdditionFuncFactory {

	static AdditionFunction create(Supplier<?> supplier) {
		
		return (AdditionFunction) supplier.get();
	}
}
