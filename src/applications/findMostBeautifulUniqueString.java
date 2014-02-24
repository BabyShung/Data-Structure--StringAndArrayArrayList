package applications;

/**
 * Facebook challenge, no idea!
 * will complete it later!
 * 
 */


import java.util.Arrays;
import java.util.HashMap;

public class findMostBeautifulUniqueString {

	public String findBeautifulUniqueString(String s) {

		if (s == null || s.length() == 0 || s.length() == 1)
			return null;

		HashMap<Integer, Object> hm = new HashMap<>();
		Object exist = new Object();

		int length = s.length();
		for (int i = 0; i < length;) {
			final int cp = s.codePointAt(i);
			i += Character.charCount(cp);
			if (!hm.containsKey(cp))
				hm.put(cp, exist);

		}

		int[] codepoints = new int[hm.size()];
		int i = 0;
		for (int tmp : hm.keySet()) {
			codepoints[i++] = tmp;
		}

		Arrays.sort(codepoints);

		int hLength = codepoints.length;
		int tmp;
		for (int j = 0; j < hLength / 2; j++) {
			tmp = codepoints[j];
			codepoints[j] = codepoints[hLength - 1 - j];
			codepoints[hLength - 1 - j] = tmp;
		}

		if (codepoints.length == length) {
			return new String(codepoints, 0, length - 1);
		} else
			return new String(codepoints, 0, codepoints.length);

	}

}
