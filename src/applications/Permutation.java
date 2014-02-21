package applications;

/**
 * given a string, permute about the possible strings
 * 
 * O(n!) n*(n-1)*(n-2)...*2*1
 * 
 * 
 * 
 * @author haozheng
 * 
 */

public class Permutation {

	public void permutation(String str) {
		permutation("", str);
	}

	private void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
			// a , bcd
			// b , a cd
			// c , ab d
			// d , abc
		}
	}

	//from pie
	public void permutation2(String str) {
		boolean[] used = new boolean[str.length()];
		StringBuilder sb = new StringBuilder();
		permutation2(str, used, sb);
	}

	private void permutation2(String str, boolean[] used, StringBuilder sb) {

		if (sb.length() == str.length()) {
			System.out.println(sb);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			if (used[i])
				continue;
			sb.append(str.charAt(i));
			used[i] = true;
			permutation2(str, used, sb);
			used[i] = false;
			sb.setLength(sb.length() - 1);
		}

	}

}
