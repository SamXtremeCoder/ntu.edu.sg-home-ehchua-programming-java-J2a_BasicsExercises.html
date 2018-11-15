
public class SquareE {

	public static void main(String[] args) {
		printSquare(10);
		System.out.println();
		printSquare(4);
	}
	
	public static void printSquare(int number) {
		printLine(number);
		printEdge(number);
		printLine(number);
	}
	
	public static void printLine(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("# ");
		}
		System.out.println();
	}
	
	public static void printEdge(int number) {
		for (int row = 2; row < number; row++) {
			for (int col = 1; col <= number; col++) {
			if (col == 1) {
				System.out.print("# ");
			} else if (col == number) {
				System.out.print("# ");
			} else {
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
