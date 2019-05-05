package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitPairManager1 extends PairManager {

	Lock lock=new ReentrantLock();

	@Override
	public  void increment() {
		lock.lock();
		try {
			pair.incrementX();
			pair.incrementY();
			store(getPair());
		} finally {
			lock.unlock();
		}
	}

}
