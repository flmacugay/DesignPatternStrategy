package com.mac;

import com.mac.strategy.AddOperation;
import com.mac.strategy.MultiplyOperation;
import com.mac.strategy.SubtractOperation;

public class TestStrategy {

	public static void main(String[] args) {

		Context con=new Context(new AddOperation());
		System.out.println(con.executeOperation(1, 2));		
		
		con=new Context(new SubtractOperation());
		System.out.println(con.executeOperation(1, 2));
		
		con=new Context(new MultiplyOperation());
		System.out.println(con.executeOperation(1, 2));
		
	}

}
