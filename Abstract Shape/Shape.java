
abstract public class Shape {
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape() {
		}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setIsFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String isItFilled() {
		String fill = "";
		if (this.filled) {
			fill += "filled";
		} else {
			fill += "not filled";
		}
		return fill;
	}
		
	abstract public double getArea();	
	abstract public double getPerimeter();
	
	public String toString() {
		return "A Shape with color of " + this.getColor() + " and is " + this.isItFilled();
	}
}
