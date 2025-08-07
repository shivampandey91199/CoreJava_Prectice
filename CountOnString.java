package coreJava;

import java.util.HashMap;
import java.util.Map;

public class CountOnString {

	public static void main(String[] args) {
		String text = "Bnana,Mango,litchi,Bnana,Apple,Mango,litchi,Apple";
		Map<String, Integer> wordAndCount = new HashMap<>();
		for (String word : text.split(",")) {
			wordAndCount.merge(word, 1, Integer::sum);
		}
		System.out.println(wordAndCount);
	}
}
