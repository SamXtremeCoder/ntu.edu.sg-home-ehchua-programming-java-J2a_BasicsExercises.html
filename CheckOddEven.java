
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckOddEven(49);
		CheckOddEven(2);
	}
	public static void CheckOddEven(int n) {
		System.out.println("The number is " + n);
		if (n%2==0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		System.out.println("Bye!");
	}
}
