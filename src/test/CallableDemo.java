package test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		ArrayList<Future<String>> futures = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			Future<String> future = executorService.submit(new TaskWithResult(i + 1));
			futures.add(future);
		}

		try {
			for (int i = 0; i < futures.size(); i++) {
				System.out.println(futures.get(i).get());
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
