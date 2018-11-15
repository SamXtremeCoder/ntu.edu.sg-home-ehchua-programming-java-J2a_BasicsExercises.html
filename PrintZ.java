
public class PrintZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printZ(10);
		System.out.println();
		printZ(5);
	}
	
	public static void printZ(int number) {
		printLine(number);
		printDiagonal(number);
		printLine(number);
	}
	
	public static void printLine(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("# ");
		}
		System.out.println();
	}
	
	public static void printDiagonal(int number) {
		for (int row = 2; row < number; row++) {
			for (int col = number-row; col >= number-row ; col--) {
				printWhiteSpace(col);
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	public static void printWhiteSpace(int number) {
		for (int i = number; i>0;i--) {
			System.out.print("  ");
		}
	}
}
