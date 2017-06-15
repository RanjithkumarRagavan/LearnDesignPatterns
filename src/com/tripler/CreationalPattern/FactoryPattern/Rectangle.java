package com.tripler.CreationalPattern.FactoryPattern;

public class Rectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
