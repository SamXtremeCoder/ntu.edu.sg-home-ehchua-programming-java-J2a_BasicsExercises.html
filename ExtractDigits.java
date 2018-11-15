
public class ExtractDigits {
	public static void main (String[] args) {
		extractDigits(12345);
		extractDigits(3331);
	}
	
	public static String extractDigits(int number) {
		String newWord = "";
		while (number > 0) {
			int digit = number % 10;
			newWord += Integer.toString(digit) + " ";
			number = number / 10;
			}
		System.out.println(newWord);
		return newWord;
	}
}
