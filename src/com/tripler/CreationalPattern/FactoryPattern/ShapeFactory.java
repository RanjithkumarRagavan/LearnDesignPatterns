package com.tripler.CreationalPattern.FactoryPattern;

import com.tripler.CreationalPattern.AbstractFactoryPattern.AbstractFactory;
import com.tripler.CreationalPattern.AbstractFactoryPattern.IColor;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IShape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
	
}
