
public class PrintDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDayInWord(1);
		PrintDayInWord(5);
		PrintDayInWord(10);
		printDayInWordTwo(1);
		printDayInWordTwo(5);
		printDayInWordTwo(10);
	}
	
	public static void PrintDayInWord(int n) {
		if (n<7) {
			if (n == 0) {
				System.out.println("Sunday");
			} else if (n == 1) {
				System.out.println("Monday");
			} else if (n == 2) {
				System.out.println("Tuesday");
			} else if (n == 3) {
				System.out.println("Wednesday");
			} else if (n == 4) {
				System.out.println("Thursday");
			} else if (n == 5) {
				System.out.println("Friday");
			} else if (n == 6) {
				System.out.println("Saturday");
			}
		} else {
			System.out.println("Not a valid day!");
		}
	}
	
	public static void printDayInWordTwo(int n) {
		switch(n) {
		case 0: System.out.println("Sunday");
		break;
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		default: System.out.println("Not a valid day!");
		break;
		}
	}
}
