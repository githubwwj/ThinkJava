package test;

public abstract class IntGenerator {

	private boolean isCanceled=false;
	
	public boolean isCanceled() {
		return isCanceled;
	}
	
	public void cancel() {
		isCanceled=true;
	}
	
	public abstract int next();
	
}
