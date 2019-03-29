package holding;

public abstract class Fruit extends Object{
	
	public static int count =0;
	private final int id = ++count;
	
	public int getId() {
		return id;
	}

}
