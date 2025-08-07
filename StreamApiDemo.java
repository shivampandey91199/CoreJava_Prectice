package coreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Employee {
	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + " (" + salary + ")";
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	// For distinct() to work on custom objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee e = (Employee) obj;
		return Objects.equals(name, e.name) && salary == e.salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
}

public class StreamApiDemo {
	public static void main(String[] args) {

		List<Employee> employees =  Arrays.asList(new Employee("Shiv", 50000), new Employee("Karan", 45000),
				new Employee("Ravi", 60000), new Employee("Sam", 30000), new Employee("Shiv", 50000), // Duplicate
				new Employee("Aryan", 70000));

		System.out.println(" Filter employees with salary > 40000:");
		employees.stream().filter(e -> e.getSalary() > 40000).forEach(System.out::println);

		System.out.println("\n Uppercase Names (using map):");
		employees.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);

		System.out.println("\n Sorted by name:");
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		System.out.println("\n Count of Employees:");
		long count = employees.stream().count();
		System.out.println("Total: " + count);

		System.out.println("\n Find First Employee:");
		employees.stream().findFirst().ifPresent(System.out::println);

		System.out.println("\n Total Salary (Reduce):");
		int totalSalary = employees.stream().map(Employee::getSalary).reduce(0, Integer::sum);
		System.out.println("Total Salary: " + totalSalary);

		System.out.println("\n Distinct Employees:");
		employees.stream().distinct().forEach(System.out::println);

		System.out.println("\n Skip 2, then take 3 Employees:");
		employees.stream().skip(2).limit(3).forEach(System.out::println);

		System.out.println("\n Parallel Stream Output:");
		employees.parallelStream().forEach(e -> System.out.println(Thread.currentThread().getName() + " => " + e));
	}
}
