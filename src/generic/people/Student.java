package generic.people;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
	}
	
	@Override
	public String toString() {
		return "Student name="+getName()+" age="+getAge();
	}

}
