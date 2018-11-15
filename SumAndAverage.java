
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(100);
	}
	
	public static int sum(int n) {
		int sum = 0;
//		int lowerLimit = 111;
//		int upperLimit = 8899;
//		for (int i = lowerLimit; i<=8899;i++ ) {
//			sum +=i;
//		}
//		for (int i = 0; i<=n;i++) {
//			if (!(i%2==0)) {
//			sum += i;
//		}
		for (int i = 0; i<=n;i++) {
//			if (i%7==0) {
			sum += i * i;
//		}
//		int i = 0;
////		while (i<101) {
////			sum += i;
////			i++;
////			n++;
//		do {
//			sum += i;
//			i++;
//		} while (i < 101);
		}
		System.out.println("The sum is " + sum + ".");
		return sum;
	}
	
	public static double average(int n) {
		
		double average = (double)sum(n) / n;
		System.out.println("The average is " + average + ".");
		return average;
	}
}
