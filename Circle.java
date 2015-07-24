package com.tusehgntkeji.quiz02;

public class Circle extends Shapes{

	private double radius=2.0;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}

}
