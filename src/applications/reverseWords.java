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
				i--;
				reverse(a, last, i);
			}
			i++;
		}
		return new String(a);
	}

	private void reverse(char[] a, int s, int e) {
		for (int i = 0; i < (e - s + 1) / 2; i++) {
			swap(a, s + i, e - i);
		}
	}

	private void swap(char[] a, int i, int j) {

		char tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
