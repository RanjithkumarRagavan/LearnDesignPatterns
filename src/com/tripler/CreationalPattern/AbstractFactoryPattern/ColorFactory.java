package com.tripler.CreationalPattern.AbstractFactoryPattern;

import com.tripler.CreationalPattern.FactoryPattern.IShape;

public class ColorFactory extends AbstractFactory {

	@Override
	public IColor getColor(String color) {
		if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      
	      return null;
	}

	@Override
	public IShape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
