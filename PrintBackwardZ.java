
public class PrintBackwardZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBackwardZ(10);
		System.out.println();
		printBackwardZ(5);
	}
	
	public static void printBackwardZ(int number) {
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
			for (int col = row; col <= row; col++) {
				printWhiteSpace(col);
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	public static void printWhiteSpace(int number) {
		for (int i = 1; i<number;i++) {
			System.out.print("  ");
		}
	}


}
