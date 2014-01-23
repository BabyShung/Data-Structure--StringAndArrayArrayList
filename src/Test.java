import applications.RansomNote;
import applications.ReverseString;


public class Test {

	public static void main(String[] args) {
//		CompressedString cs = new CompressedString();
//		System.out.println(cs.compressString("aaabbbbcccdddddgeeeeeeee"));

		
//		//char[] tmp = { 'a', 'c', ' ', ' ', ' ', 'v', '1', '1', '1', '1', '1', '1', '1' };
//		char[] tmp = new char[50];
//		tmp[0] = 'a';
//		tmp[1] = ' ';
//		tmp[2] = 'c';
//		tmp[3] = ' ';
//		tmp[4] = ' ';
//		tmp[5] = 'd';
//		replaceSpacesWithPercent20 rsw = new replaceSpacesWithPercent20();
//		rsw.replaceSpaceWithPercent20(tmp, 6);
//
//		for (int i = 0; i < tmp.length; i++) {
//			System.out.print(tmp[i]);
//		}

//		ArrayBasedArrayList<Object> abal = new ArrayBasedArrayList<Object>();
//		abal.add(2);
//		abal.add(3);
//		abal.add(5);
//		for(int i=0;i<abal.size();i++){
//			System.out.println(abal.get(i)+" ");
//		}
		
//		int arr[] = {4,5,6,7,8,9,10,11,1,2,3};
//		Rotated_SortedArray rsa = new Rotated_SortedArray(arr);
//		rsa.getMin(0, arr.length-1);

	
//		checkPermutationOrNot cpon = new checkPermutationOrNot();
//		System.out.println(cpon.checkPermutation("abcd", "badc"));
//		System.out.println(cpon.checkPermutation2("abcd", "dcab"));
		
		
//		Rotated_isSubstring riss = new Rotated_isSubstring();
//		System.out.println(riss.checkIsSubstring("water", "erwat"));
		
		
//		checkStringUniqueCharacter csuc = new checkStringUniqueCharacter();
//		System.out.println(csuc.checkingStringUniqueCharacter("afwqrcg"));
//		System.out.println(csuc.checkingStringUniqueCharacter2("asfewq"));
		
		
//		RansomNote rn = new RansomNote();
//		boolean result = rn.checkRansomNote("I am a MCS student I I");
//		System.out.println("result: " + result);
		
		ReverseString rs = new ReverseString();
		System.out.println("reversed: "+rs.reverse_String("abcdef"));
		System.out.println("reversed: "+rs.reverse_String_recursion("abcdef"));
		System.out.println("reversed: "+rs.reverse_String_stack("abcdef"));
		System.out.println("reversed: "+rs.reverse_String_stack2("abcdef"));
	}

}
