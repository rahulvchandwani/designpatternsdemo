package com.behavioralpattern.interpreter;

public class MainClient {
	public static void main(String[] args) {
		InterpreterContext interpreterContext = new InterpreterContext();
		interpreterContext.setValue1(10);
		interpreterContext.setValue2(20);
		
		Expression addExpression = new AddExpression();
		addExpression.interpret(interpreterContext);
		
		System.out.println(interpreterContext.getResult());
		
		Expression multiplyExpression = new MultiplyExpression();
		multiplyExpression.interpret(interpreterContext);
		System.out.println(interpreterContext.getResult());
	}
}
