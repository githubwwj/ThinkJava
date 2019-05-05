package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitPairManager2 extends PairManager {

	Lock lock=new ReentrantLock();

	@Override
	public void increment() {
		Pair temp;
		lock.lock();
		try {
			pair.incrementX();
			pair.incrementY();
			temp = getPair();
		} finally {
			lock.unlock();
		}
		store(temp);
	}

}
