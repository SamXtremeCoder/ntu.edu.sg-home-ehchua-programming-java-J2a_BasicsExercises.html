
public class CheckerBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkerBoard(4);
		System.out.println();
		checkerBoard(10);
	}
	
	public static void checkerBoard(int number) {
		for (int row = 0; row < number; row++) {
			if (row % 2 == 1) {
				System.out.print(" ");
			}
			for (int col = 0; col < number; col++) {
					System.out.print("# ");
			}
			System.out.println();
		}
	}
}
