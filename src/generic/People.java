package generic;

public class People {
	
	String name;
	int age;
	
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
