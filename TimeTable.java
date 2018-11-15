
public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timeTable(10);
		System.out.println();
		timeTable(2);
	}
	
	public static void timeTable(int number) {

		int k = 0;
		for (int i = 0; i <= number; i++) {
			if (i == 0) {
				System.out.print(String.format("%5s", "* | "));
			} else {
				System.out.print(String.format("%5s", i + " "));
			}
		}
		
		System.out.println();
		
		for (int i = 0; i <= number*5; i++) {
			System.out.print("-");
		}

		for (int j = 1; j<=number; j++) {
			System.out.println();
			for (int i = 0; i <= number; i++) {
				if (i == 0) {
					System.out.print(String.format("%5s", j + " | "));
				} else {
					k = i * j;
					System.out.print(String.format("%5s", k + " "));
				}
			}
		}
	}
}
