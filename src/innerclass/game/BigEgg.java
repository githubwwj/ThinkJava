package innerclass.game;

public class BigEgg extends Egg{

	public BigEgg() {
		System.out.println("BigEgg()");
	}
	
	class Yolk{
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
	
}
