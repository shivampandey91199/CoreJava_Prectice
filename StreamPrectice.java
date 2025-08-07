package coreJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class name {
	int id;
	String name;
	long phn_no;
	int salary;

	public name(int id, String name, long phn_no, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.phn_no = phn_no;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(long phn_no) {
		this.phn_no = phn_no;
	}

	@Override
	public String toString() {
		return "name [id=" + id + ", name=" + name + ", phn_no=" + phn_no + ", salary=" + salary + "]";
	}

}

public class StreamPrectice {
	public static void main(String[] args) {

		List<name> names = Arrays.asList(new name(1, "Shivam", 262626545, 40000), new name(2, "Mukul", 262626545, 20000),
				new name(3, "Deva", 262626545, 1000000), new name(4, "Anand", 262626545, 400000),
				new name(5, "Vikram", 262626545, 500000));

		System.out.println("\nFilter with salary greter then 20000");
		names.stream().filter(e -> e.getSalary() > 20000).forEach(System.out::println);
 
		
		
		System.out.println("\nConvert in UpperCase ");
		names.stream().map(e ->e.getName().toUpperCase()).forEach(System.out::println);
	}

}
