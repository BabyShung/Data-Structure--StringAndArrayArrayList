package applications;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	private Map<String, Integer> wordsMap;

	private String magazine = "Hello I am a MCS student I come from China"
			+ " and I love computer science My MCS friends here are very friendly";

	public RansomNote() {

		wordsMap = new HashMap<String, Integer>();

		init();

		// print();
	}

	public boolean checkRansomNote(String sentence) {

		String[] words = sentence.split(" ");
		Integer count;
		for (String word : words) {

			count = wordsMap.get(word);
			if (count == null || count < 1) {
				return false;
			} else {
				wordsMap.put(word, count - 1);
			}
		}
		print();
		return true;
	}

	private void init() {
		String[] words = magazine.split(" ");
		Integer value;
		for (String word : words) {

			value = wordsMap.get(word);
			if (value == null)
				wordsMap.put(word, 1);
			else
				wordsMap.put(word, value + 1);
		}
	}

	private void print() {
		System.out.println("------");
		for (Integer tmp : wordsMap.values()) {
			System.out.println(tmp);
		}
		System.out.println("------");
	}

}
