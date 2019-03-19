package reusing;

public class Student extends Person {

	//通过继承可以访问所有的方法
	public void learn() {
		System.out.println("Student learn");
	}

	private int age;

	@Override
	public String toString() {
		return "name=" + getName() 
		+ "   sex=" + getSex() + "  age=" + age;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("李健");
		student.setSex(1);
		student.age = 28;
		System.out.println(student);
	}

}
