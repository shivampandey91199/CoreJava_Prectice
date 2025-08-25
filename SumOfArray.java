package coreJava;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfArray {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 1, 1, 1 };
		int num = Arrays.stream(arr).sum();
		System.out.println(num);
	}
}
