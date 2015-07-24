package com.tusehgntkeji.quiz02;

import java.util.ArrayList;

public class Shapes {
	
	public static void main(String[] args) {
		ArrayList<Shapes> shapes=new ArrayList<Shapes>();
		shapes.add(new Rectangle());
		shapes.add(new Square());
		shapes.add(new Triangle());
		shapes.add(new Circle());
		
		System.out.println("Total Area:" + getTotalArea(shapes));
		
		
	}
	
	private static double getTotalArea(ArrayList shapes) {
		double area=0;
		for(int i=0;i<shapes.size();i++){
			area+=((Shapes) shapes.get(i)).getArea();
		}
		return area;
	}

	public double getArea(){
		return 1.0;
	}

}
