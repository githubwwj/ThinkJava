package polymorphic.meal;

/**
 * ¼òÒ×Îç²Í
 */
public class PortableLauch extends Launch {

	Bread bread = new Bread();
	Cheese cheese = new Cheese();

	public PortableLauch() {
		System.out.println("PortableLauch()");
	}

	public static void main(String[] args) {
		new PortableLauch();
	}
	
	public void play() {
		System.out.println("PortableLauch.play()");
	}
	
//	Meal()
//	Play before
//	PortableLauch.play()
//	Play after
//	Launch()
//	Bread()
//	Cheese()
//	PortableLauch()


}
