
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonnaci(20);
	}
	
	public static int fibonnaci(int i){
	      int n = 3;          // the index n for F(n), starting from n=3
	      int fn = 0;             // F(n) to be computed
	      int fnMinus1 = 1;   // F(n-1), init to F(2)
	      int fnMinus2 = 1;   // F(n-2), init to F(1)
	      int nMax = 20;      // maximum n, inclusive
	      int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
	      double average;
	      
	      while (n <= nMax) {
	    	  fn = fnMinus1 + fnMinus2;
	    	  sum += fn;
	    	  System.out.print(fn + " ");
	    	  ++n;
	    	  fnMinus2 = fnMinus1;
	    	  fnMinus1 = fn;
	      }
	      average = (double) sum/(i);
	      System.out.println();
	      System.out.println("The average is: " + average);
	      return fn;
	}
}
