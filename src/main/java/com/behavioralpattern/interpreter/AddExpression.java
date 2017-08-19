package com.behavioralpattern.interpreter;

public class AddExpression implements Expression {

	@Override
	public void interpret(InterpreterContext interpreterContext) {
		int result = interpreterContext.getValue1() + interpreterContext.getValue2();
		interpreterContext.setResult(Integer.toString(result));
	}
}
