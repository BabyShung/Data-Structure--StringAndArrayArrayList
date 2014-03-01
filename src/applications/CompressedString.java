package applications;

/**
 * Question:
 * Given a string eg:"abbbccdddd", compress it to "a1b3c2d4".
 * If the compressed one's length >= the original one, then just return the original.
 * @author haozheng
 *
 */

public class CompressedString {
	
	public String compressString(String input) {

		int inputSize = input.length();
		int newSize = checkSize(input);
		if (newSize >= inputSize)
			return input;

		System.out.println("--");
		StringBuilder sb = new StringBuilder();
		char last = input.charAt(0);
		char current;
		int count = 1;

		for (int i = 1; i < inputSize; i++) {

			current = input.charAt(i);

			if (current == last) {
				count++;
			} else {// not equal
				sb.append(last);
				sb.append(count);
				last = current;
				// reset
				count = 1;
			}
		}

		// also append the last character
		sb.append(last);
		sb.append(count);

		return sb.toString();
	}

	private int checkSize(String input) {

		int size = 0;
		int count = 1;
		char last = input.charAt(0);
		char current;

		for (int i = 1; i < input.length(); i++) {
			current = input.charAt(i);

			if (current == last) {
				count++;
			} else {// not equal
				last = current;
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}

		size += 1 + String.valueOf(count).length();
		return size;
	}
}
