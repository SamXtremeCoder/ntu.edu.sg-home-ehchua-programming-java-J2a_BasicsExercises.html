
public class TriangleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangleB(8);
	}
	public static void printTriangleB(int number) {
		for (int row = 1; row <= number; row++) {
			for (int col = row; col <= number; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
