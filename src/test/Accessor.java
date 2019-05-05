package test;

public class Accessor implements Runnable {

	private int id;

	public Accessor(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			System.out.println("create:"+this);
//			ThreadLocalVariableHolder.increment();
			System.out.println("result:"+this);
			Thread.yield();
		}
	}

	@Override
	public String toString() {
		return "#" + id + ":" + ThreadLocalVariableHolder.get();
	}

}
