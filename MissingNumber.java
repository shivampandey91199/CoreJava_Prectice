package interviewprep;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
	public static void main(String[] args) {
		int[] array = { 2, 3, 3, 3, 4, 4, 5,7, 8, 9, 1 };

		Set<Integer> set = Arrays.stream(array)
				.distinct()
				.boxed()
				.collect(Collectors.toSet());
		
		List<Integer> list = IntStream.rangeClosed(1,9)
				.filter(i -> !set.contains(i))
				.boxed()
				.toList();
		
		System.out.println(list);

	}
}
