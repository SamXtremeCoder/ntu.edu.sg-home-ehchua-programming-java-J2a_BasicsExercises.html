
public class TestShape {

	public static void main(String[] args) {
//		Shape s1 = new Shape();
//		System.out.println(s1.getColor());
//		System.out.println(s1.isFilled());
//		System.out.println(s1);
//		
//		Shape s2 = new Shape("blue", false);
//		System.out.println(s2);
//		
//		Circle c2 = new Circle();
//		System.out.println(c2.getRadius());
//		System.out.println(c2);
//		
//		Rectangle r1 = new Rectangle("blue", false,2.0, 1.5);
//		System.out.println(r1);
		
		Square s1 = new Square();
		System.out.println(s1.getSide());
		s1.setWidth(2.0);
		s1.setLength(2.0);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1);
	}

}
