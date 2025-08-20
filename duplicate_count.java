package coreJava;

import java.util.Map;
import java.util.TreeMap;

public class duplicate_count {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 3, 4
				, 4, 5, 6, 6, 6, 7, 8 };

		Map<Integer, Integer> result=new TreeMap<>();
		for(int num:arr) {
			result.put(num,result.getOrDefault(num, 0)+1);
		}
		System.out.println(result);
	}
}
