
public class CozaLozaWoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cozaLozaWoza(110);
	}
	
	public static String cozaLozaWoza(int n) {
		String newWord = "";
		for (int i = 1; i<n; i++) {
			if (i%3==0 && i%5==0) {
				newWord += "CozaLoza ";
			} else if (i%3 == 0) {
				newWord += "Coza ";
			} else if (i%5==0) {
				newWord += "Loza ";
			} else if (i%7==0) {
				newWord += "Woza ";
			} else {
				newWord += Integer.toString(i) + " ";
			}
			if (i%11 == 0) {
				newWord += "\n";
			}	
		}
		System.out.println(newWord);
		return newWord;
	}
}
