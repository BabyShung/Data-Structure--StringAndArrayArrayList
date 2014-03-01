package applications;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	private String magazine = "Hello I am a MCS student I come from China"
			+ " and I love computer science My MCS friends here are very friendly";

	public boolean checkRansomNote(String sentence) {

		Map<String, Integer> wordsMap = new HashMap<String, Integer>();

		String[] words = magazine.split(" ");
		for (String word : words) {

			if (wordsMap.containsKey(word))
				wordsMap.put(word, 1);
			else
				wordsMap.put(word, wordsMap.get(word) + 1);
		}

		Integer count;
		for (String word : words) {

			count = wordsMap.get(word);
			if (count == null || count < 1) {
				return false;
			} else {
				wordsMap.put(word, count - 1);
			}
		}
		print(wordsMap);
		return true;
	}

	private void print(Map<String, Integer> wordsMap) {
		System.out.println("------");
		for (Integer tmp : wordsMap.values()) {
			System.out.println(tmp);
		}
		System.out.println("------");
	}

}
