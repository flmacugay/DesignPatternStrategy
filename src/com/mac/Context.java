package com.mac;

import com.mac.strategy.MathStrategy;

public class Context {
	
	private MathStrategy strategy;

	public Context(MathStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	
	public int executeOperation(int a, int b) {
		return strategy.doOperation(a, b);
	}
	
	
}
