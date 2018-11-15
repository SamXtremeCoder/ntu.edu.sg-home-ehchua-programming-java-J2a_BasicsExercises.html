
public class TriangleC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangleC(8);
	}
	public static void triangleC(int number) {
		for (int row = 0; row < number; row++) {
			printWhiteSpace(row);
			for (int col = number - row; col > 0; col--) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	public static void printWhiteSpace(int number) {
		for (int i = 0; i<number;i++) {
			System.out.print("  ");
		}
	}
}
