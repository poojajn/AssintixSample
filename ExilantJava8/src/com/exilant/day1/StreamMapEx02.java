package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//to show working of map and filter based on the customer type
public class StreamMapEx02 {
	// jdk 1.7
	public static List<PriorityCutomer> filCustomers(List<Customer> customes) {
		List<PriorityCutomer> priorityCutomers = new ArrayList<PriorityCutomer>();
		for (Customer temp : customes) {
			if (temp.getCustomerPurchases() > 5000) {
				priorityCutomers.add(new PriorityCutomer(temp.getCustomerId(), temp.getCustomerName(), "gold"));
			}
		}
		return priorityCutomers;
	}

	// jdk1.8
	public static List<PriorityCutomer> filCustomers1(List<Customer> customes) {
		List<PriorityCutomer> priorityCutomers = customes.stream().map(temp -> {
			if (temp.getCustomerPurchases() > 5000) {
				return new PriorityCutomer(temp.getCustomerId(), temp.getCustomerName(), "gold");
			}
			return null;
		}).collect(Collectors.toList());

		return priorityCutomers;

	}

	public static List<PriorityCutomer> filCustomers2(List<Customer> customes) {
		List<PriorityCutomer> priorityCutomers = customes.stream().map(temp -> {
			return new PriorityCutomer(temp.getCustomerId(), temp.getCustomerName(),
					temp.getCustomerPurchases() > 0 && temp.getCustomerPurchases() < 3000 ? "silver"
							: temp.getCustomerPurchases() > 3000 && temp.getCustomerPurchases() < 5000 ? "gold"
									: "platinum");
		}).collect(Collectors.toList());
		return priorityCutomers;

	}

	// jdk8 second method
	public static List<PriorityCutomer> filCustomers3(List<Customer> customes) {
		return customes.stream().filter(temp -> temp.getCustomerPurchases() > 5000).map(temp -> {
			return new PriorityCutomer(temp.getCustomerId(), temp.getCustomerName(), "gold");
		}).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "Ramu", 6000, "Engineer"),
				new Customer(102, "Ramu", 4000, "Engineer"), new Customer(102, "pooja", 7000, "Develoer"),
				new Customer(103, "allaharakha", 9000, "Laed"), new Customer(104, "anuj", 8000, "Engineer"),
				new Customer(105, "anuj", 1000, "Tester"));
		filCustomers(customers).forEach(System.out::println);

		System.out.println("----------------------");
		filCustomers1(customers).forEach(System.out::println);
		filCustomers2(customers).forEach(System.out::println);
		filCustomers3(customers).forEach(System.out::println);

	}

}
