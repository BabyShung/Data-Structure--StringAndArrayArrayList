package applications;

/**
 * classic conversion int to string and string to int
 * 
 * several solutions for each, notice the space complexity
 * 
 * @author haozheng
 * 
 */

public class IntegerStringConversion {

	public int atoi(String str) {// string to int

		/**
		 * Consider:
		 * 
		 * 1. null or empty string 2. white spaces 3. +/- sign 4. calculate real
		 * value 5. handle min & max
		 * 
		 */

		if (str == null || str.length() < 1)
			return 0;

		str = str.trim();
		boolean negative = false;
		int i = 0;
		if (str.charAt(i) == '-') {
			negative = true;
			i++;
		} else if (str.charAt(i) == '+') {
			i++;
		}

		double num = 0;
		int value;
		for (; i < str.length(); i++) {
			value = str.charAt(i);
			if (value <= '9' && value >= '0')
				num = num * 10 + (value - '0');
			else
				break;
		}

		if (negative)
			num *= -1;

		if (num > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (num < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) num;
	}

	public int atoi2(String str) {// string to int
		if (str == null || str.length() < 1)
			return 0;

		// trim white spaces
		str = str.trim();

		char flag = '+';

		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;

		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		if (flag == '-')
			result = -result;

		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) result;
	}

	public int StringToInteger(String s) { // O(n) time and O(1) space
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

	public int StringToInteger2(String s) { // O(n) time and O(1) space
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

	public String IntegerToString(int num) { // O(n) time and O(1) space

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

	/**
	 * uses a char array, first put all the last digit in the array
	 * incrementally, then append from the last one in the array. It is like
	 * using a stack
	 */
	public String IntegerToString2(int num) { // O(n) time and O(n) space

		int i = 0;
		boolean negative = false;

		char[] tmp = new char[10];// normal int won't exceed
		if (num < 0) {
			negative = true;
			num = -num;
		}
		do {
			tmp[i++] = (char) (num % 10 + '0');
			num /= 10;
		} while (num != 0);

		StringBuilder sb = new StringBuilder();
		if (negative)
			sb.append('-');
		while (i > 0)
			sb.append(tmp[--i]);
		return sb.toString();
	}

}
