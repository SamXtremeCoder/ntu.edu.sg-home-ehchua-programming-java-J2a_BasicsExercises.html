
public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxDenominator = 50000;  // Use a more meaningful name instead of n
	      double sumL2R = 0.0;    // sum from left-to-right
	      double sumR2L = 0.0;
	      
	    for (int LDenominator = 1; LDenominator <= maxDenominator; LDenominator++) {
	    	sumL2R += 1.0/LDenominator;
	    }
	    System.out.println("sumL2R: " + sumL2R);
	    
	    for (int RDenominator = maxDenominator; RDenominator >= 1; RDenominator--) {
	    	sumR2L += 1.0/RDenominator;
	    }
	    System.out.println("sumR2L: " + sumR2L);
	}
	

}
