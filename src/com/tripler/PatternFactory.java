package com.tripler;

import com.tripler.CreationalPattern.AbstractFactoryPattern.AbstractFactoryPattern;
import com.tripler.CreationalPattern.FactoryPattern.FactoryPattern;

public class PatternFactory {
	public IDesignPatterns get(String pattern) {
			if (pattern == null) {
				return null;
			}
			if (pattern.equalsIgnoreCase(Constants.FACTORY_PATTERN)) {
				return new FactoryPattern();

			} else if(pattern.equalsIgnoreCase(Constants.ABSTRACT_FACTORY_PATTERN))
			{
				return new AbstractFactoryPattern();
			}
			return null;
		}
}
