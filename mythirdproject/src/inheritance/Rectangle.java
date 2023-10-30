package inheritance;

public class Rectangle extends Shape {
	private double height;
	private double width;

	public Rectangle() {
		super();
	}

	@Override
	public double calculateArea() {
		return height * width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double perimeter() {
		return 2 * (height * width);
	}
}
