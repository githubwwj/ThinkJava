package test;

public class PairManager2 extends PairManager {

	
	@Override
	public void increment() {
		Pair temp;
		synchronized (this) {
			pair.incrementX();
			pair.incrementY();
			temp = getPair();
		}
		store(temp);
		
	}

}
