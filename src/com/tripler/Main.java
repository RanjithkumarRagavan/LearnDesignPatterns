package com.tripler;

public class Main {

	public static void main(String[] args) {
		PatternFactory patternFactory = new PatternFactory();
		//Used Factory pattern to execute it. Just change only the constant name to run different factory examples.
		IDesignPatterns pattern = patternFactory.get(Constants.ABSTRACT_FACTORY_PATTERN);
		pattern.executePatternExample();
	}

}
