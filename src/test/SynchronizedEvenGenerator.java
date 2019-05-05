package test;

public class SynchronizedEvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;

	@Override
	public synchronized int next() {
		currentEvenValue++;
		System.out.println(Thread.currentThread().getName()+"  "+currentEvenValue);
//		Thread.yield();
//		currentEvenValue++;
		return currentEvenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}


