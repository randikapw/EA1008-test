package executer;

import shapes.Circle;
import shapes.Shape;

public class Main {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[4];
		
		Circle circle1 = new Circle();
		circle1.setColor("Blue");
		circle1.setRadius(3.2);
		
		Circle circle2 = new Circle();
		circle2.setColor("Pink");
		circle2.setRadius(1);
		
		Circle circle3 = new Circle();
		circle3.setRadius(3);
		
		Circle circle0 = new Circle();
		
		shapes[0] = circle0;
		shapes[1] = circle1;
		shapes[2] = circle2;
		shapes[3] = circle3;
		
		
		for (Shape shape : shapes) {
			System.out.println(shape.getShapeSummary());
			System.out.println();
		}

	}

}
