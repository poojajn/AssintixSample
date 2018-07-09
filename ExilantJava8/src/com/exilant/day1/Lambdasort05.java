package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdasort05 {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "ramu", 6000, "Engineer"),
				new Customer(102, "ramu", 4000, "Engineer"), new Customer(102, "pooja", 7000, "Develoer"),
				new Customer(103, "allaharakha", 9000, "Laed"), new Customer(104, "anuj", 8000, "Engineer"),
				new Customer(105, "anuj", 1000, "Tester"));

		System.out.println("............Before sort...................");
		customers.forEach(System.out::println);

		// jdk 1.7 or older version syntax
		Collections.sort(customers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}

		});
		System.out.println("............After Sort on Name.....................");
		customers.forEach(System.out::println);

		// jdk 1.8
		System.out.println("..............Afetr sort on parchase..................................");
		customers.sort((Customer c1, Customer c2) -> (int) (c1.getCustomerPurchases() - c2.getCustomerPurchases()));
		customers.forEach(System.out::println);

		// jdk 1.8
		System.out.println("..............Afetr sort on designation.....................");
		customers.sort((c1, c2) -> c1.getDesigantion().compareTo(c2.getDesigantion()));
		customers.forEach(System.out::println);

		Comparator<Customer> customerNameAssComparator = (c1, c2) -> c1.getCustomerName()
				.compareTo(c2.getCustomerName());

		Collections.sort(customers, customerNameAssComparator);
		
		System.out.println("..............afetr sort on name (Asc)");
		customers.forEach(System.out::println);

		Collections.sort(customers, customerNameAssComparator.reversed());
		System.out.println("..............afetr sort on name (Dsc)");
		customers.forEach(System.out::println);

		
	}

}
