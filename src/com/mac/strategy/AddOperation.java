package com.mac.strategy;


public class AddOperation implements MathStrategy {

	@Override
	public int doOperation(int a, int b) {
		return a+b;
	}

}
