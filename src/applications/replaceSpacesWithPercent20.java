package applications;

/**
 * Question:
 * Given a string, for all of its 'spaces', replace them with '%20'
 * 
 * use char[]
 * don't forget '\0', end of string
 * 
 * EG:
 * a bc de
 * a%20bc%20de 
 * 
 * @author haozheng
 *
 */


public class replaceSpacesWithPercent20 {

	public void replaceSpaceWithPercent20(char[] arr, int origLen) {

		int count = 0;

		for (int i = 0; i < origLen; i++) {
			if (arr[i] == ' ')
				count++;
		}

		int newLen = origLen + 2 * count;
		arr[newLen] = '\0';

		int iNL = newLen - 1;

		for (int j = origLen - 1; j >= 0; j--) {
			if (arr[j] != ' ') {
				arr[iNL] = arr[j];
				iNL--;
			} else {
				arr[iNL] = '0';
				arr[iNL - 1] = '2';
				arr[iNL - 2] = '%';
				iNL -= 3;

			}
		}
	}

}
