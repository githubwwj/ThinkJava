package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenChecker implements Runnable {

	private IntGenerator intGenerator;
	private int id;

	public EvenChecker(IntGenerator intGenerator, int ident) {
		this.id = ident;
		this.intGenerator = intGenerator;
	}

	@Override
	public void run() {
		while (!intGenerator.isCanceled()) {
			int val = intGenerator.next();
			if (val % 2 != 0) {
				System.out.println(val + " not even!");
				intGenerator.cancel();
			}
		}
	}	

	public static void test(IntGenerator generator) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new EvenChecker(generator, 10));
		}
		executorService.shutdown();
	}

}