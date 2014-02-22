package applications;

/**
 * show all the combinations of a string
 * 
 * 3 solutions
 * 
 * what is the running time of it?
 * O(2^n) or O(n!) ?
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

	
	//from pie
	public void combination3(String s) {
		StringBuilder sb = new StringBuilder();
		combination3(0, s, sb);
	}

	private void combination3(int start, String s, StringBuilder sb) {
		for (int i = start; i < s.length() - 1; i++) {
			sb.append(s.charAt(i));
			System.out.println(sb);
			combination3(i + 1, s, sb);
			sb.setLength(sb.length() - 1);
		}
		sb.append(s.charAt(s.length() - 1));
		System.out.println(sb);
		sb.setLength(sb.length() - 1);
	}

}
