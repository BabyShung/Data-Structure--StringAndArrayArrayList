import ArrayList.ArrayBasedArrayList;

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

		ArrayBasedArrayList<Object> abal = new ArrayBasedArrayList<Object>();
		abal.add(2);
		abal.add(3);
		abal.add(5);
		for(int i=0;i<abal.size();i++){
			System.out.println(abal.get(i)+" ");
		}
		
		
	}

}
