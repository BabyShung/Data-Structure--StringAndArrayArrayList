package applications;

/**
 * Q1: Remove Elements from Array.
 * Given an array and a value, remove all
 * instances of that value in place and return the new length. It doesn't matter
 * what you leave beyond the new length.
 * 
 * 
 * @author haozheng
 * 
 */
public class RemoveFromArray {
	public int removeElement(int[] a, int e) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == e)
				count++;
			else if (count > 0)
				a[i - count] = a[i];
		}
		return a.length - count;

	}
}
