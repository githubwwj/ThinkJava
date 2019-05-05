package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class PairManager {

	AtomicInteger checkCounter = new AtomicInteger();
	private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
	protected Pair pair = new Pair();
	protected int count = 1;

	public  Pair getPair() {
		return new Pair(pair.getX(), pair.getY());
	}

	protected void store(Pair p) {
		storage.add(p);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public abstract void increment();
}
