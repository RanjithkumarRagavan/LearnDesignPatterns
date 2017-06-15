package com.tripler.CreationalPattern.AbstractFactoryPattern;

import com.tripler.CreationalPattern.FactoryPattern.IShape;

public abstract class AbstractFactory {
  public abstract IColor getColor(String color);
  public abstract IShape getShape(String shape);
}
