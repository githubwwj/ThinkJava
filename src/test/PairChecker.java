package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PairChecker implements Runnable {

	private PairManager pairManager;
	private	Lock lock = new ReentrantLock();

	public PairChecker(PairManager pairManager) {
		super();
		this.pairManager = pairManager;
	}

	@Override
	public void run() {
		while (true) {
			pairManager.checkCounter.incrementAndGet();
			pairManager.getPair().checkState();
		}
	}

}
