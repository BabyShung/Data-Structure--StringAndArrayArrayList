package applications;

/**
 * Reverse the order of words in a string
 * 
 * EG: "Hao is a good guy." to "guy. good a is Hao"
 * 
 * Solutions: 1.In-place (more likely)
 * 
 * a.reverse the whole, b.set counter to scan through
 * 
 * 2.not in-place
 * 
 * a.split b.for(int i = str.length-1; i>=0;i--), reverse current word and
 * append a space
 * 
 * a.create a same size char array. b.start from the last, scan through to the
 * first. c.if meet a space, reverse last to this space, keep on...
 * 
 * @author haozheng
 * 
 */

public class reverseWords {

	public String reverseWordsInPlace(String str) {
		char[] a = str.toCharArray();

		reverse(a, 0, a.length - 1);

		int last, i = 0;

		while (i < a.length) {

			if (a[i] != ' ') {
				last = i;
				while (i < a.length && a[i] != ' ')
					i++;
				reverse(a, last, i - 1);
			} else
				i++;
		}
		return new String(a);
	}

	private void reverse(char[] a, int s, int e) {
		for (int i = 0; i < (e - s + 1) / 2; i++) {
			swap(a, s + i, e - i);
		}
	}

	// private String reverse(String str) {
	// char[] a = str.toCharArray();
	// for (int i = 0; i < a.length / 2; i++) {
	// swap(a, i, a.length - 1 - i);
	// }
	// return new String(a);
	// }

	private void swap(char[] a, int i, int j) {

		char tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	/**
	 * not in place
	 */
	public String reverseWordsNotInPlace(String str) {

		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
		}
		return sb.toString();
	}

	// this one should be the fastest, just one time O(n)
	//this is because using additional space can decrease running time
	public String reverseWordsNotInPlace2(String str) {

		char[] a = str.toCharArray();
		char[] buffer = new char[a.length];

		int current = 0;
		int last;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != ' ') {
				last = i;

				while (i >= 0 && a[i] != ' ')
					i--;

				// copy
				for (int j = i + 1; j <= last; j++) {
					buffer[current++] = a[j];
				}
				// append space
				if (current < a.length)
					buffer[current++] = ' ';
			} else
				i--;
		}
		return new String(buffer);
	}
}
