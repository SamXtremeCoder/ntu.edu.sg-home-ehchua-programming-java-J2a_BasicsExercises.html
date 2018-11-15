
public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tribonacci(20);
	}
	
	public static int tribonacci(int number) {
		int n = 3; //the index n for F(n), starting from n=3;
		int fn = 0; // F(n) to be computed
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int fnMinus3 = 2;
		int sum = fnMinus1 + fnMinus2 + fnMinus3;
		
		while (n<=number) {
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			sum += fn;
			System.out.print(fn + " ");
			n++;
			fnMinus1 = fnMinus3;
			fnMinus3 = fnMinus2;
			fnMinus2 = fn;
			
		}
		return fn;
	}
}
