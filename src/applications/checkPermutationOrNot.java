package applications;

/**
 * Question:
 * Given two strings, check if one is a permutation of the other
 * 
 * 4 solutions
 * 
 * 1.hashmap, store one string, for the other string, minus the value, finally check if value >0 or not
 * 2.use 256 array, same as first one 
 * 3.calculate the total value of both two, and compare   O(1) space
 * 
 * unimplemented:
 * 4.sort both a and b, and compare corresponding char --O(nlogn)
 * 
 */

import java.util.HashMap;

public class checkPermutationOrNot {

	public boolean checkPermutation(String a, String b) { // O(n) space

		if (a.length() != b.length())
			return false;

		// input
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length(); i++) {
			int tmp = a.charAt(i);
			Integer getV = hm.get(tmp);
			if (getV == null) {
				hm.put(tmp, 1);
			} else {
				hm.put(tmp, getV++);
			}
		}

		// check
		for (int i = 0; i < b.length(); i++) {
			int tmp = b.charAt(i);
			Integer getV = hm.get(tmp);
			if (getV == null || getV < 1) {
				return false;
			} else {
				hm.put(tmp, --getV);
			}
		}

		for (Integer tmp : hm.values()) {
			// if is permutation, then every value in hashtable should be 0 (all
			// matched)
			if (tmp > 0)
				return false;
		}

		return true;
	}

	public boolean checkPermutation2(String a, String b) {

		if (a.length() != b.length())
			return false;

		// ASC2
		int[] countArr = new int[256];

		char[] aArr = a.toCharArray();
		for (int i = 0; i < aArr.length; i++) {
			countArr[aArr[i]]++;
		}

		char[] bArr = b.toCharArray();
		for (int i = 0; i < bArr.length; i++) {
			if (countArr[bArr[i]] < 0)
				return false;
			else
				countArr[bArr[i]]--;
		}

		return true;
	}

	public boolean checkPermutation3(String a, String b) {

		if (a.length() != b.length())
			return false;

		int sa = 0, sb = 0;
		for (int i = 0; i < a.length(); i++) {
			sa += a.charAt(i);
			sb += b.charAt(i);
		}
		if (sa == sb)
			return true;
		else
			return false;
	}

}
