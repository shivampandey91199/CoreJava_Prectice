package interviewprep;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountLetter {
	public static void main(String[] args) {

		String input = "bnana";

		Map<Character,Long> collect = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		collect.forEach((ch, count) -> 
        System.out.println(ch + " = " + count));

	}
}
