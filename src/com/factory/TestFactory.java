package com.factory;

public class TestFactory {
	public static void main(String []args){
		//get Triangle shape 
		Shape triangle = ShapeFactory.getShape("Triangle");
		triangle.drawShape();

		//get Rectangle shape 
		Shape rectangle = ShapeFactory.getShape("Rectangle");
		rectangle.drawShape();

		//get Square shape 
		Shape square = ShapeFactory.getShape("Square");
		square.drawShape();
	}
}
