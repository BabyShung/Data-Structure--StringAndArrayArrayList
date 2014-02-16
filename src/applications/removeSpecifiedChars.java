package applications;

/**
 * 
 * Write an efficient method that deletes chars from an ASCII string EG:
 * "abcabcdefjj" and remove "abcj", output is "def"
 * 
 * @author haozheng
 * 
 */
public class removeSpecifiedChars {

	public String removeChars(String str, String remove) {

		char[] a = str.toCharArray();
		char[] r = remove.toCharArray();

		// usually 128 is enough for normal chars, 256 is for extended wierd
		// chars
		boolean[] lookup = new boolean[256];

		for (int i = 0; i < r.length; i++) {
			lookup[r[i]] = true;
		}

		int current = 0;
		for (int i = 0; i < a.length; i++) {
			if (!lookup[a[i]])// if that is not the specified removed char
				a[current++] = a[i];
		}

		return new String(a, 0, current);

	}

}
