
public class SquareBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareBoard(4);
		System.out.println();
		squareBoard(5);
	}
	
	public static void squareBoard(int number) {
		for (int row = 0; row < number; row++) {
			for (int col = 0; col < number; col++) {
				System.out.print("# ");
			}
			System.out.println();
			}
	}
}
