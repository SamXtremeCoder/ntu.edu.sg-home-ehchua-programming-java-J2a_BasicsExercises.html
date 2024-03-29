
public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double newLength) {
		this.length = newLength;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return ((this.width*2) + (this.length*2));
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width= " + this.getWidth() + " and length= "
				+ this.getLength() + ", which is a subclass of " + super.toString();
	}
}
