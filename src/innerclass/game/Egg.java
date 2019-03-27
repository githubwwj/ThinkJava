package innerclass.game;

public class Egg {
	
	public Egg() {
		System.out.println("Egg");
		new Yolk();
	}
	
	class Yolk{
		public Yolk() {
			System.out.println("Yolk()");
		}
	}

}
