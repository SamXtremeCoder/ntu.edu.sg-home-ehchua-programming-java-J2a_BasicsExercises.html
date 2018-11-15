
public class TriangleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangleA(8);
	}
	
	public static void printTriangleA(int number) {
		for (int row = 1; row<=number;row++) {
		 for (int col = 1; col <= row; col++) {
			System.out.print("# ");
		 	}
		 System.out.println();
		}
	}
}
