package com.tusehgntkeji.quiz02;

public class Rectangle extends Shapes{

	private double length=10;
	private double width=5;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea(){
		return this.length*this.width;
	}

}
