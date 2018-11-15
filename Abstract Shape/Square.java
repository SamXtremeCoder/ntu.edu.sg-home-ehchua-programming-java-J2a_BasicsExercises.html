
public class Square extends Rectangle {

	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(color, filled, side, side);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
//	public void setSide(double side) {
//		
//	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
	
	public String toString() {
		return "A Square with side= " + this.getSide() + ", which is a subclass of " + super.toString();
	}
}
