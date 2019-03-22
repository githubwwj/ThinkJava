package polymorphic.meal;

/**
 * Ò»¶Ù·¹
 */
public class Meal {

	public Meal() {
		System.out.println("Meal()");
		
		System.out.println("Play before");
		play();
		pay();
		System.out.println("Play after");
	}
	
	public void play() {
		System.out.println("Meal.play()");
	}
	
	private void pay() {
		
	}
	
}
