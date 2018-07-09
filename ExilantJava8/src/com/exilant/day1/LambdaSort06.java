package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort06 {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "ramu", 6000, "Engineer"),
				new Customer(102, "ramu", 4000, "Engineer"), new Customer(102, "pooja", 7000, "Develoer"),
				new Customer(103, "allaharakha", 9000, "Laed"), new Customer(104, "anuj", 8000, "Engineer"),
				new Customer(105, "anuj", 1000, "Tester"));

		System.out.println("............Before sort...................");
		customers.forEach(System.out::println);
		
		System.out.println("..............Afetr sort on designation.....................");
		customers.sort((c1, c2) -> c1.getDesigantion().compareTo(c2.getDesigantion()));
		customers.forEach(System.out::println);
        
		

	}

}
