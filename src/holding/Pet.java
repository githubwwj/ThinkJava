package holding;

/**
 * ³èÎï
 */
public class Pet extends Object implements Comparable<Pet> {

	private static int count = 0;
	private final int id = ++count;
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet() {
		super();
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
		if (obj instanceof Pet) {
			if (((Pet) obj).id == id) {
				return true;
			}
		}
		return super.equals(obj);
	}

	@Override
	public int compareTo(Pet o) {
//		if (o.id < id) {
//			return 1; //ÉýÐò
//		}
		if (o.id < id) {
			return -1; //½µÐò
		}
		return 0;
	}

}
