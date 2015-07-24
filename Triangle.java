package com.tusehgntkeji.quiz02;

public class Triangle extends Shapes{

	private double length=10;
	private double height=10;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea(){
		return this.length*this.height/2;
	}

}
