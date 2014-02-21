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
		// back to front
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
		// front to back
		for (int j = i; j < s.length(); j++) {
			result *= 10;
			result += s.charAt(j) - '0';
		}

		return negative ? result * -1 : result;
	}

	public String IntegerToString(int num) {	//O(n) time and O(1) space

		StringBuilder sb = new StringBuilder();
		if (num < 0) {
			num *= -1;
			sb.append('-');
		}

		int divisor = 1;
		while (num / divisor >= 10) {
			divisor *= 10;
		}
		while (divisor != 0) {
			int leftDigit = num / divisor;
			char strD = (char) (leftDigit + '0');
			sb.append(strD);
			num = num % divisor;
			divisor /= 10;
		}
		return sb.toString();
	}

	
	
}
