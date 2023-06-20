package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class ProgramShape {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
	
	}
	
	// <? extends Shape> permite que o método aceite tipos Shape e seus subtipos
	// não podemos adicionar novos elementos na lista quando usamos tipo curinga
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
