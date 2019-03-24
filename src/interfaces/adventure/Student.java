package interfaces.adventure;

public class Student implements Adventure {

	@Override
	public void fight() {
		System.out.println(getClass().getSimpleName());
		System.out.println("Student.fight");
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName());
		System.out.println("Student.fly");
	}

	@Override
	public void swim() {
		System.out.println(getClass().getSimpleName());
		System.out.println("Student.swim");
	}

	

}
