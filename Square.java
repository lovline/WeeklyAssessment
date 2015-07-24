package com.tusehgntkeji.quiz02;

public class Square extends Shapes{

	private double length=10;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea(){
		return this.length*this.length;
	}
}
