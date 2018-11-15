
public class Product1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product1ToN(25);
		int counter = 1*2*3*4*5*6*7*8*9*10*11*12*13;
	}
	
	public static void product1ToN(long n) {
		long sum = 0;
		for (int i = 1; i< n-1; i++) {
			sum = (i * i+1) + sum;
		}
		System.out.println(sum);
	}
}
