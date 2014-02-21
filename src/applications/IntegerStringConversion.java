package applications;

public class IntegerStringConversion {

	public int StringToInteger(String s) {
		boolean negative = false;
		int i = 0;
		if (s.charAt(i) == '-') {
			negative = true;
			i++;
		}
		int base = 1, result = 0, tmp;
		//back to front
		for (int j = s.length() - 1; j >= i; j--) {
			tmp = s.charAt(j) - '0';
			result += base * tmp;
			base *= 10;
		}

		return negative ? result * -1 : result;
	}

	public int StringToInteger2(String s) {
		boolean negative = false;
		int i = 0;
		if (s.charAt(i) == '-') {
			negative = true;
			i++;
		}
		int result = 0;
		//front to back
		for (int j = i; j < s.length(); j++) {
			result *= 10;
			result += s.charAt(j) - '0';
		}

		return negative ? result * -1 : result;
	}

}
