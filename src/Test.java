import CircularArray.CircularArray;
import applications.Combination;
import applications.FindFirstNonrepeatedChar;
import applications.RemoveFromArray;
import applications.reverseWords;


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
		
//		ReverseString rs = new ReverseString();
//		System.out.println("reversed: "+rs.reverse_String("abcdef"));
//		System.out.println("reversed: "+rs.reverse_String_recursion("abcdef"));
//		System.out.println("reversed: "+rs.reverse_String_stack("abcdef"));
//		System.out.println("reversed: "+rs.reverse_String_stack2("abcdef"));
		
//		Permutation pm = new Permutation();
//		pm.permutation("abcd");
		
		Combination cc = new Combination();
		cc.combination("abcd");
		System.out.println("---------");
		cc.combination2("abcd");
		
		String a = "Acd ;'[]sdfc.';f9 98 7d3";
		a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(a);
		
		
		CircularArray<Integer> cca = new CircularArray<>(5);
		cca.set(0, 1);
		cca.set(1, 2);
		cca.set(2, 3);
		cca.set(3, 4);
		cca.set(4, 5);
		cca.rotate(2);
		for(Integer tmp : cca){
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		
		RemoveFromArray rfa = new RemoveFromArray();
		
		int[] rfa1 = {3,2,5,6,3,4,1,3,7,3};	//length 10
		System.out.println(rfa.removeElement(rfa1, 3));
		int[] rfa2 = {2,2,3,3,3,3,4,4,4,5};	//length 10
		System.out.println(rfa.removeDuplicateElement(rfa2));
		int[] rfa3 = {2,2,3,3,3,3,4,4,4,5};	//length 10
		int newLength3 = rfa.removeDuplicateElement2(rfa3);
		System.out.println(newLength3);
		for(int i=0;i<newLength3;i++)
			System.out.print(rfa3[i]+" ");
		System.out.println();
		
		
		FindFirstNonrepeatedChar ffnr = new FindFirstNonrepeatedChar();
		String c = ffnr.firstNonrepeated("fmqweomfq");
		System.out.println("firstnonrepeated: "+ c);
		
		reverseWords rw = new reverseWords();
		String rwresult = rw.reverseWordsInPlace("Bang! dare you try me a little.");
		System.out.println(rwresult);
		String rwresult2 = rw.reverseWordsNotInPlace("Bang! dare you try me a little.");
		System.out.println(rwresult2);
		String rwresult3 = rw.reverseWordsNotInPlace2("Bang! dare you try me a little.");
		System.out.println(rwresult3);
	}

}
