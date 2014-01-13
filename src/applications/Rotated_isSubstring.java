package applications;

/**
 * Question:
 * 
 * Using isSubstring once,
 * given string a, b, check if b is a rotation of a.
 * 
 * EG:
 * "water" is a rotation of "terwa"
 * @author haozheng
 *
 */

public class Rotated_isSubstring {

	public boolean checkIsSubstring(String a, String b) {

		if (a.length() != b.length() || a.length() <= 0)
			return false;
		else {
			String newA = a + a;
			return isSubstring(newA, b);
		}
	}

	private boolean isSubstring(String a, String b) {
		return a.contains(b);
	}

}
