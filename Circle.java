
public class Circle extends Shape {
	private double radius = 1.0;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
		}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public double getArea() {
		return this.getRadius() * this.getRadius() * Math.PI;
	}
	
	public double getPerimeter() {
		return this.getRadius() * 2 * Math.PI;
	}
	
	@Override
	public String toString() {
		return "A Circle with radius= " + this.getRadius() + ", which is a subclass of " + super.toString();
		}
}		

