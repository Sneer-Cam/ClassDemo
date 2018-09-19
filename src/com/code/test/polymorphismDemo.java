package com.code.test;

public class polymorphismDemo {

	public static void main(String[] args) 
	{
		Shapes obj = new Shapes();
		obj.draw();
		obj = new Circle(); 
		obj.draw();
		obj = new Square();
		obj.draw();
	}

}
