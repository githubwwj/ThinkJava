package test;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalVariableHolder {
	
	static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
		Random random = new Random(47);

		protected Integer initialValue() {
			System.out.println("initialValue()");
			return random.nextInt(100);
		};
	};

	public static void increment() {
		threadLocal.set(threadLocal.get() + 1);
	}
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 1; i++) {
			executorService.execute(new Accessor(i));
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executorService.shutdownNow();
		System.out.println(Thread.currentThread().getContextClassLoader());
	}

	public static Integer get() {
		return threadLocal.get();
	}

}
