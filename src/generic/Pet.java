package generic;

public class Pet {
	
	String name;
	int age;
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
}
