package test;

public class PairManipulator implements Runnable {

	private PairManager pairManager;

	public PairManipulator(PairManager pairManager) {
		super();
		this.pairManager = pairManager;
	}

	@Override
	public void run() {
		while (true) {
			pairManager.increment();
		}
	}

	@Override
	public String toString() {
		return "Pair: " + pairManager.getPair() + " checkCount=" + pairManager.checkCounter.get();
	}

}
