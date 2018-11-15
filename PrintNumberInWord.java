
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumberInWord(1);
		PrintNumberInWord(4);
		PrintNumberInWordTwo(4);
		PrintNumberInWordTwo(1990);
		
	}
	public static void PrintNumberInWord(int n) {
		while (n > 0 && n < 10) {
		if (n == 1) {
			System.out.println("One");
			break;
		} else if (n == 2) {
			System.out.println("Two");
			break;
		} else if (n == 3) {
			System.out.println("Three");
			break;
		} else if (n == 4) {
			System.out.println("Four");
			break;
		} else if (n == 5) {
			System.out.println("Five");
			break;
		} else if (n == 6) {
			System.out.println("Six");
			break;
		} else if (n == 7) {
			System.out.println("Seven");
			break;
		} else if (n == 8) {
			System.out.println("Eight");
			break;
		} else {
			System.out.println("Nine");
			break;
			}
		}
	}
	
	public static void PrintNumberInWordTwo(int n) {
		switch(n) {
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		case 6: System.out.println("Six");
		break;
		case 7: System.out.println("Seven");
		break;
		case 8: System.out.println("Eight");
		break;
		case 9: System.out.println("Nine");
		break;
		default: System.out.println("What!");
		}
	}
}
