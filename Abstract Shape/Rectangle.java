
public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length,String color, boolean filled) {
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
	
	@Override
	public double getArea() {
		return this.length * this.width;
	}
	
	@Override
	public double getPerimeter() {
		return ((this.width*2) + (this.length*2));
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width= " + this.getWidth() + " and length= "
				+ this.getLength() + ", which is a subclass of " + super.toString();
	}
}
