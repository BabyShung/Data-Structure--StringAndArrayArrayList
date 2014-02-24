package applications;

import java.util.ArrayList;

/**
 * given a string, permute about the possible strings
 * 
 * O(n!) n*(n-1)*(n-2)...*2*1
 * 
 * 2 solutions
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

	// from pie
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

	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

		if (num.length < 1)
			return results;
		if (num.length == 1) {
			ArrayList<Integer> perm = new ArrayList<Integer>();
			perm.add(num[0]);
			results.add(perm);
			return results;
		}

		for (int i = 0; i < num.length; ++i) {
			// copy a new array of n-1 numbers
			int[] subset = new int[num.length - 1];
			for (int j = 0; j < i; ++j)
				subset[j] = num[j];
			
			
			for (int j = i + 1; j < num.length; ++j)
				subset[j - 1] = num[j];
			
			
			// append the current number to the end of permutations of n-1
			// subset
			for (ArrayList<Integer> perm : permute(subset)) {
				perm.add(num[i]); // append to the end, O(1)
				results.add(perm);
			}
		}
		return results;
	}

}
