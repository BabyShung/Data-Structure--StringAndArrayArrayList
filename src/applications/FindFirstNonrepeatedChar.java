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
	public Character firstNonrepeated(String str) {

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
