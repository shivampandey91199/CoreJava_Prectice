package coreJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateDemo {
	public static void main(String[] args) {

		Predicate<Integer> isEven = e -> e % 2 == 0;
		System.out.println("is 6 Even ? " + isEven.test(6));

		List<String> names = Arrays.asList("John", "Alex", "Bob", "Amit");

		Predicate<String> startsWithA = name -> name.startsWith("A");

		names.stream().filter(startsWithA).forEach(System.out::println);

	}
}
