package holding;

/**
 * ³èÎï
 */
public class Pet extends Object {

	private static int count = 0;
	private final int id = ++count;
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pet) {
			if (((Pet) obj).id == id) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
