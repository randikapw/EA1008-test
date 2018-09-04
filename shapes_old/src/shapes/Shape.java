package shapes;

import java.awt.Color;

public abstract class Shape {
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Abstract methods which MUST override in a sub class.
	public abstract double getArea();
	public abstract double getCircumference();
	public abstract String getShapeName(); 
	public abstract String getShapeSummary(); 
	
}
