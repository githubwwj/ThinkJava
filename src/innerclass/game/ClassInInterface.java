package innerclass.game;

public interface ClassInInterface {

	void wow();

	class Test implements ClassInInterface {

		@Override
		public void wow() {
			System.out.println("wow!");
		}

		public static void main(String[] args) {
			Test inInterface = new Test();
			inInterface.wow();
		}

	}

}
