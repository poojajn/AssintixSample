package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LamdaThreadService06 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("hi i am in anonymous block");
			}
		});
		executorService.shutdown();
		// jdk 1.8 way
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(() -> {
			System.out.println("hi i am in lambda block");
		});
		executorService1.shutdown();
		System.out.println("callable work");
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables = initializeCallables();
		/*
		 * String result=executorService2.invokeAny(callables);
		 * System.out.println("Result"+result);
		 */
		List<Future<String>> results = executorService2.invokeAll(callables);
		for (Future temp : results) {
			System.out.println(temp.get());
		}
		executorService2.shutdown();

	}

	// this method will create set of callables(each callable is 1 thread)
	// this method will scafold the thread in real world
	public static Set<Callable<String>> initializeCallables() {
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		callables.add(() -> "1st Callable");
		callables.add(() -> "2st Callable");
		callables.add(() -> "3st Callable");
		callables.add(() -> "4st Callable");
		callables.add(() -> "5st Callable");
		callables.add(() -> "6st Callable");

		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Callable htread in anonymous class";
			}

		});
		callables.add(() -> {
			return "complex called business logic";
		});
		return callables;

	}

}
