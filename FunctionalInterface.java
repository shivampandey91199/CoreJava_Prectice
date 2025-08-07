package coreJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	 public static void main(String[] args) {
		List<String> names=Arrays.asList("vikram","Shivam","Krunal","Amrit","akshay");
		
		// return boolean value 
	    Predicate<String> startWithA = name -> name.toLowerCase().startsWith("a");
		System.out.println("Names Starting with A : ");
		names.stream().filter(startWithA).forEach(System.out::println);
	
		// return length of each name 
		Function<String, Integer> nameLength= name ->name.length();
		System.out.println("\nlength of each name : ");
		names.stream().map(nameLength).forEach(System.out::println);
		
		// supplier 
		// only use in get Method 
		Supplier<String> greetSupplier=() ->"Hello from Supplier";
		System.out.println("\nSupplier Says :: "+greetSupplier.get());
		
		// consumer 
		Consumer<String> PrintName= name ->System.out.println("Processing...\n"+name);
		System.out.print("\nusing consumer for processing name : ");
		names.forEach(PrintName);
		
	 }
}
