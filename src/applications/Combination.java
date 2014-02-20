package applications;

/**
 * O(n^2)
 * 
 * @author haozheng
 *
 */

public class Combination {

	public void combination(String s) {
		combination("", s);
	}

	// print all subsets of the remaining elements, with given prefix
	private void combination(String prefix, String s) {
		if (s.length() > 0) {
			System.out.println(prefix + s.charAt(0));
			combination(prefix + s.charAt(0), s.substring(1));
			combination(prefix, s.substring(1));
		}
	}

	// alternate implementation
	public void combination2(String s) {
		combination2("", s);
	}

	private void combination2(String prefix, String s) {
		System.out.println(prefix);
		for (int i = 0; i < s.length(); i++)
			combination2(prefix + s.charAt(i), s.substring(i + 1));

		/**
		 * traditional calculating: C1,4 + C2,4 + C3,4 + C4,4
		 * 
		 * recursive way:
		 * 
		 * comb(a,bcd) comb(b,cd) comb(c,d) comb(d,"")
		 * 
		 */
	}
}
