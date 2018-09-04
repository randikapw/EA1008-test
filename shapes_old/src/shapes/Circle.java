package shapes;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("The Prameter radius must be greater than 0.");
			// but this is the correct way to handle it with exceptions.
			// new
			// IllegalArgumentException("The Prameter radius must be greater than 0.");
		}
	}

	// overriding abstract methods.
	@Override
	public double getArea() {
		if (radius > 0) {
			return Math.PI * Math.pow(radius, 2);
		} else {
			System.out
					.println("The circle might not initialized wiht valid diamensions");
		}
		return 0;
	}

	@Override
	public double getCircumference() {
		if (radius > 0) {
			return Math.PI * 2 * radius;
		} else {
			System.out
					.println("The circle might not initialized wiht valid diamensions");
		}
		return 0;
	}

	@Override
	public String getShapeName() {
		return "Circle";
	}

	@Override
	public String getShapeSummary() {
		String summary = "The " + getShapeName();
		if (radius > 0) {
			summary += " with the radius " + getRadius()
					+ " coveres an area of " + getArea()
					+ ". And its circumference is " + getCircumference() + ".";
			String color = getColor();
			if (color != null) {
				summary += "\n It is a " + color + " " + getShapeName() + ".";
			} else {
				summary += "\n It is not assigned with any color.";
			}
		} else {
			summary += " might not initialized with valid diamensions.";
		}
		
		return summary;
	}

}
