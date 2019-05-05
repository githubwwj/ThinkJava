package test;

public class EvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;

	@Override
	public int next() {
		currentEvenValue++;
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"  "+currentEvenValue);
		return currentEvenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator());
	}
}


