
public class CheckPassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPassFail(49);
		CheckPassFail(51);
	}
	
	public static void CheckPassFail(int mark) {
		if (mark >= 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("DONE");
	}
}
