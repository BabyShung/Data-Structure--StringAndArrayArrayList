package applications;

/**
 * Question:
 * 
 * Given a string,check whether it has all unique characters
 * 
 * sol1: brute force O(n^2) sol2: sort first and linearly compare every
 * consecutive two O(nlogn)
 * 
 * sol3: using character encoding, we assume it uses ASCII (8bits, 256 total),
 * while Unicode is 16bits and 65536 total)
 * 
 * @author haozheng
 * 
 */

public class checkStringUniqueCharacter {

	public boolean checkingStringUniqueCharacter(String a) {

		if (a.length() > 256)
			return false;

		//total ASCII is 256
		boolean[] check = new boolean[256];

		for (int i = 0; i < a.length(); i++) {
			int tmp = a.charAt(i);
			if (check[tmp])
				return false;
			else
				check[tmp] = true;
		}
		return true;
	}
	
	
	//using bit manipulation, but assuming string are only 'a' - 'z' 
	//since int has only 32bits, and lowercase alphabatics is 26
	
	public boolean checkingStringUniqueCharacter2(String a) {
		
		int check = 0;
		for (int i = 0; i < a.length(); i++) {
			int val = a.charAt(i) - 'a';
			
			//if bit/character exists, result > 0, then return false
			if((check & (1 << val)) > 0 )	
				return false;
			
			check |= (1 << val);//update corresponding bit
		}
		return true;
	}
	
}
