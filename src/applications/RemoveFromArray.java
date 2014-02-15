package applications;

/**
 * In place remove
 * 
 * 
 * Q1: Remove Elements from Array.
 * 
 * Given an array and a value, remove all
 * instances of that value in place and return the new length. It doesn't matter
 * what you leave beyond the new length.
 * 
 * Q2:Remove Duplicates from Sorted Array
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
	
	public int removeDuplicateElement(int[] a) {

		int count = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i-1])
				count++;
			else if (count > 0)
				a[i - count] = a[i];
		}
		return a.length - count;

	}
	
	public int removeDuplicateElement2(int[] a) {

		int count = 0;
		for (int i = 2; i < a.length; i++) {
			if (a[i] == a[i-count-1] &&a[i] == a[i-count-2] )
				count++;
			else if (count > 0)
				a[i - count] = a[i];
		}
		return a.length - count;

	}
	
	
}
