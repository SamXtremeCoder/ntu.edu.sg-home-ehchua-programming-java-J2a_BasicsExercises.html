
public class Shape {
	private String color = "red";
	private boolean filled = true;
	
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
	
	public String isItFilled() {
		String fill = "";
		if (this.filled) {
			fill += "filled";
		} else {
			fill += "not filled";
		}
		return fill;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {

		return "A Shape with color of " + this.getColor() + " and is " + this.isItFilled();
	}
}
