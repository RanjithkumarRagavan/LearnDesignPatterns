package com.tripler.CreationalPattern.AbstractFactoryPattern;

import com.tripler.CreationalPattern.FactoryPattern.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
	   }
}
