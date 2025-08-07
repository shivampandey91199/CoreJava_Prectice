package coreJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Emp {
	String name;
	String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}

	public Emp(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

}

public class StreamQuestion {
	public static void main(String[] args) {

		System.out.println("Name Start with A :: ");
		List<String> names = List.of("Ankit", "Ravi", "Ajay", "Shivam", "Arjun");
		names.stream().filter(e -> e.toLowerCase().startsWith("a")).forEach(System.out::println);

		System.out.println("Convert string into upper case ");
		List<String> words = List.of("java", "stream", "api");
		words.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("Square of each number  ");
		List<Integer> nums = List.of(2, 3, 4, 5);
		nums.stream().map(e -> Math.pow(e, 2)).forEach(System.out::println);

		System.out.println("find even number  ");
		List<Integer> num = List.of(1, 2, 3, 4, 5, 6);
		num.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

		System.out.println("find name length more then 4 ");
		List<String> name = List.of("Shivam", "Avi", "Karan", "Jo");
		name.stream().filter(e -> e.length() > 4).forEach(System.out::println);

		System.out.println("List of assending number ");
		List<Integer> numss = List.of(5, 1, 4, 2, 3);
		numss.stream().sorted().forEach(System.out::println);

		System.out.println("First name in list : ");
		List<String> Names = List.of("Shivam", "Rahul", "Anand");
		Optional<String> firstName = Names.stream().findFirst();
		firstName.ifPresent(e -> System.out.println("First name: " + e));

		System.out.println("Sum all values in a list");
		List<Integer> numbers = List.of(10, 20, 30, 40);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum of values are :: " + sum);

		System.out.println("Skip and limit :: ");
		List<String> items = List.of("a", "b", "c", "d", "e");
		items.stream().skip(2).limit(3).forEach(System.out::println);

		// Grouping by Collectors
		List<Emp> emplist = Arrays.asList(new Emp("shivam", "JAVA"), new Emp("Vikram", "JAVA"),
				new Emp("krunal", "JAVA"), new Emp("Bala", "DA"), new Emp("shivanshu", "QA"));
		Map<String, List<Emp>> Groupofdept = emplist.stream().collect(Collectors.groupingBy(Emp::getDepartment));
		Groupofdept.forEach((dept, employees) -> {
			System.out.println("Departments :: " + dept);
			employees.forEach(emp -> System.out.println(" - " + emp.getName()));
		});

		// partitining by
		List<Integer> numBers = List.of(1, 2, 3, 4, 5);
		Map<Boolean, List<Integer>> collect = numBers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("Even number :: " + collect.get(true));
		System.out.println("Odd number :: " + collect.get(false));

	}
}
