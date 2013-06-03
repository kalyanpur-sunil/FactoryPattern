package com.factory;

public class ShapeFactory {
	
	public static Shape getShape(String shape){
		if(shape.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else if(shape.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("Square")){
			return new Square();
		} 
		return null;
				
	}
}
