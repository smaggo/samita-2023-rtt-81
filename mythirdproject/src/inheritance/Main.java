package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.setName("Rectangel");
		rect.setHeight(10);
		rect.setWidth(5);

		Circle circle = new Circle();
		circle.setName("Circle");
		circle.setDiameter(100);

		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);

		for (Shape shape : shapes) {
			System.out.println("The area for shape " + shape.getName() + " is " + shape.calculateArea());
		}
	}
}
