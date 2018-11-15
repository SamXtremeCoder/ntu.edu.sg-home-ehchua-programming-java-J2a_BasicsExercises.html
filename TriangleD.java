
public class TriangleD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangleD(8);
	}
	public static void triangleD(int number) {
		for (int row = number; row > 0; row--) {
			printWhiteSpace(row);
			for (int col = number-row+1; col > 0; col--) {
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
