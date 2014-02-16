package applications;

import java.util.HashMap;

/**
 * Write an efficient method to find the first nonrepeated character in a string
 * 
 * 
 * @author haozheng
 * 
 */

public class FindFirstNonrepeatedChar {

	//best dealing with Unicode 2-byte character
	public String firstNonrepeated(String str) {

		HashMap<Integer, Object> hm = new HashMap<>();
		Object once = new Object();
		Object multi = new Object();
		Object seen;

		int length = str.length();
		for (int i = 0; i < length;) {
			final int cp = str.codePointAt(i);
			i += Character.charCount(cp);// if single byte, i++,if 2-byte, i+=2
			seen = hm.get(cp);

			if (seen == null)	//deal with autoboxing
				hm.put(cp, once);
			else if (seen == once)
				hm.put(cp, multi);
		}

		for (int j = 0; j < length;) {
			final int cp = str.codePointAt(j);
			j += Character.charCount(cp);
			
			if (hm.get(cp) == once)
				return new String(Character.toChars(cp));
			// why a string? since a char might not represent a 2-byte unicode
			// element
		}
		return null;
	}

	/**
	 * Two major flaws:
	 * 
	 * 1. assuming all unicode character can be represented in a single 16-bit
	 * java char
	 * 
	 * 2. autoboxing for the value (Integer), since every time we increment the
	 * Integer obj, the obj is thrown away and a new Integer obj with
	 * incremented value is created.
	 * 
	 */
	public Character firstNonrepeated2(String str) {

		HashMap<Character, Integer> hm = new HashMap<>();
		int length = str.length();
		Character c;
		for (int i = 0; i < length; i++) {
			c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (int j = 0; j < length; j++) {
			c = str.charAt(j);
			if (hm.get(c) == 1)
				return c;
		}
		return null;
	}

}
