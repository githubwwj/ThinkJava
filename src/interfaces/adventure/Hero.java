package interfaces.adventure;

public class Hero implements CanFly,CanFight,CanSwim {

	public static void main(String[] args) {
		
		Hero hero=new Hero();
		s(hero);
		f(hero);
		
		System.out.println("-----------");
		Adventure adventure=new Student();
		adventure.fly();
		adventure.fight();
		adventure.swim();
		
//		Hero
//		swim
//		Hero
//		fight
//		-----------
//		Student
//		Student.fly
//		Student
//		Student.fight
//		Student
//		Student.swim


	}
	
	public static void s(CanSwim canSwim) {
		canSwim.swim();
	}
	
	public static void f(CanFight canFight) {
		canFight.fight();
	}

	@Override
	public void swim() {
		System.out.println(getClass().getSimpleName());
		System.out.println("swim");
	}

	@Override
	public void fight() {
		System.out.println(getClass().getSimpleName());
		System.out.println("fight");
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName());
		System.out.println("fly");
	}

}
