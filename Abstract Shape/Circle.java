
public class Circle extends Shape {
		private double radius = 1.0;
		
		public Circle() {
			super();
		}
		
		public Circle(double radius) {
			super();
			this.radius = radius;
		}
		
		public Circle(double radius, String color, boolean filled) {
			super(color, filled);
			this.radius = radius;
			}
		
		public double getRadius() {
			return this.radius;
		}
		
		public void setRadius(double newRadius) {
			this.radius = newRadius;
		}
		
		@Override
		public double getArea() {
			return this.getRadius() * this.getRadius() * Math.PI;
		}
		
		@Override
		public double getPerimeter() {
			return this.getRadius() * 2 * Math.PI;
		}
		
		@Override
		public String toString() {
			return "A Circle with radius= " + this.getRadius() + ", which is a subclass of " + super.toString();
			}
	}		

