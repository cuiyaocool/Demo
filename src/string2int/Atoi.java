package string2int;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numString = "-123";
		System.out.println(atoi(numString));

	}

	private static int atoi(String num) {
		// TODO Auto-generated method stub
		if (num == null || num.length() < 1) {
			throw new NumberFormatException();
		}
		char first = num.charAt(0);
		if (first == '-') {
			return parseString(num, 1, false);
		}
		if (first == '+') {
			return parseString(num, 1, true);
		}
		if (first <= '9' && first >= '0') {
			return parseString(num, 0, true);
		}
		throw new NumberFormatException();
	}

	private static int parseString(String num, int i, boolean b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
