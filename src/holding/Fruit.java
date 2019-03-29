package holding;

public abstract class Fruit extends Object{
	
	public static int count =0;
	private final int id = ++count;
	private String name;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
	public Fruit() {
		super();
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + "]";
	}
	

}
